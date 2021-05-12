package shop.goodcasting.api.common.crawl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;

@Repository
public interface CrawlRepository extends JpaRepository<HireBoard,Long> {
}
