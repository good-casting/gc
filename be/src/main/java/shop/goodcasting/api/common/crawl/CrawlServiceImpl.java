package shop.goodcasting.api.common.crawl;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.common.csv.ConvertToCSV;
import shop.goodcasting.api.user.actor.domain.Actor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log
@Service
@RequiredArgsConstructor
public class CrawlServiceImpl implements CrawlService{

    private final CrawlRepository crawlRepo;

    @Override
    public List<Actor> actorCrawl(Actor actor) throws IOException {
        log.info("save all 접속");
        Document document = connectUrl("https://www.filmmakers.co.kr/actorsProfile/category/282/page/1");
        Elements link = document.select("div.description>a");

        List<Actor> actorList = new ArrayList<>();
        List<String> list = new ArrayList();

        for (int i = 0; i < link.size(); i++) {;
            String a = link.get(i).attr("href");
            list.add(a);
        }

        for(int i=0; i < link.size(); i++){
            String value = list.get(i);

            Document innerDoc = connectUrl("https://www.filmmakers.co.kr" + value);

            Element phoneNumber = innerDoc.select("table.unstackable>tbody>tr:eq(2)>td.three+td").first();
            Element height = innerDoc.select("table.unstackable>tbody>tr:eq(3)>td.three+td").first();
            Element weight = innerDoc.select("table.unstackable>tbody>tr:eq(4)>td.three+td").first();

            actor.setPhone(phoneNumber.text());
            actor.setWeight(weight.text());
            actor.setHeight(height.text());

            actorList.add(actor);
        }
        return actorList;
    }

    @Override
    public List<Actor> nomalCrawl() throws IOException {
//        log.info("save all 접속");
//        Document document = connectUrl("https://castpick.co.kr/front/castpick/castingList?codeNum=50000002");
//        crawlRepo.deleteAll();
//
//        Elements ttl = document.select("div.list_col5_img2>div>p.tit");
//
        List<Actor> hireList = new ArrayList<>();
//
//        for (int i = 0; i < ttl.size(); i++) {
//            Actor a = new Actor();
//            a.setTitle(ttl.get(i).text());
//            hireList.add(a);
//            crawlRepo.save(a);
//        }
        return hireList;
    }

    @Override
    public Document connectUrl(String url) throws IOException {
        return Jsoup
                .connect(url)
                .method(Connection.Method.GET)
                .userAgent("Mozilla/5.0 (X11; Linux x86_64; rv:10.0) " +
                        "Gecko/20100101 Firefox/10.0 " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/51.0.2704.106 Safari/537.36")
                .execute()
                .parse();
    }
}