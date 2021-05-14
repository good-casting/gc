package shop.goodcasting.api.board.hireboad.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;

@Repository
public interface HireBoardRepository extends JpaRepository<HireBoard, Long> {
}
