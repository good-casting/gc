package shop.goodcasting.api.common.crawl;

import org.jsoup.nodes.Document;
import shop.goodcasting.api.article.hire.domain.Hire;

import java.io.IOException;
import java.util.List;

public interface CrawlService {
    Document connectUrl(String url) throws IOException;
    List<Hire> saveAll(Hire hire) throws IOException;
}
