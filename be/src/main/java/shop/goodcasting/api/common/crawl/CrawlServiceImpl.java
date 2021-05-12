package shop.goodcasting.api.common.crawl;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.common.csv.ConvertToCSV;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log
@Service
@RequiredArgsConstructor
public class CrawlServiceImpl implements CrawlService{

    private final CrawlRepository crawlRepo;


    @Override
    public List<Hire> saveAll() throws IOException {
        log.info("save all 접속");
        Document document = connectUrl("https://castpick.co.kr/front/castpick/castingList?codeNum=50000002");

        Elements ttl = document.select("div.list_col5_img2>div>p.tit");

        List<Hire> hireList = new ArrayList<>();



        for (int i = 0; i < ttl.size(); i++) {
            Hire hi = new Hire();
            hi.setTitle(ttl.get(i).text());

            hireList.add(hi);
            crawlRepo.save(hi);
        }
        ConvertToCSV csv = new ConvertToCSV();
        csv.convert2CSV(hireList);
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