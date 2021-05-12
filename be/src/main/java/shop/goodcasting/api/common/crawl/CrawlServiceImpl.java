package shop.goodcasting.api.common.crawl;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.board.hireboad.domain.HireBoardDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log
@Service
@RequiredArgsConstructor
public class CrawlServiceImpl implements CrawlService{

    private final CrawlRepository crawlRepo;
    private final ModelMapper modelmapper;

    @Override
    public List<HireBoardDTO> saveAll() throws IOException {
        log.info("save all 접속");
        Document document = connectUrl("https://castpick.co.kr/front/castpick/castingList?codeNum=50000002");


        Elements ttl = document.select("div.list_col5_img2>div>p.tit");

        List<HireBoardDTO> hireList = new ArrayList<>();

        for (int i = 0; i < ttl.size(); i++) {
            HireBoardDTO hi = new HireBoardDTO();
            hi.setTitle(ttl.get(i).text());
            HireBoard hireBoard =modelmapper.map(hi, HireBoard.class);
            hireList.add(hi);
            crawlRepo.save(hireBoard);
        }
        return hireList;
    }
    @Override
    public List<HireBoardDTO> fetchFilm() throws IOException {
        log.info("filmMaker crawling 접속");
        Document document = connectUrl("https://www.filmmakers.co.kr/performerWanted");

        Elements ttl = document.select("div.mobile-padding>div>table>tbody>tr>td>a>strong");
        Elements ctt = document.select("div.mobile-padding>div>table>tfoot>tr>td");

        List<HireBoardDTO> hireList = new ArrayList<>();

        for (int i = 0; i < ttl.size(); i++) {
            HireBoardDTO hi = new HireBoardDTO();
            hi.setTitle(ttl.get(i).text());
            hi.setContents(ctt.get(i).text());
            HireBoard hireBoard = modelmapper.map(hi, HireBoard.class);
            hireList.add(hi);
            crawlRepo.save(hireBoard);
        }
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