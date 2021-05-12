package shop.goodcasting.api.common.crawl;

import org.jsoup.nodes.Document;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.board.hireboad.domain.HireBoardDTO;

import java.io.IOException;
import java.util.List;

public interface CrawlService {
    Document connectUrl(String url) throws IOException;
    List<HireBoardDTO> saveAll() throws IOException;
    List<HireBoardDTO> fetchFilm() throws IOException;
}
