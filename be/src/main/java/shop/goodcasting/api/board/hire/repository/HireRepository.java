package shop.goodcasting.api.board.hire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.board.hire.domain.Hire;

@Repository
public interface HireRepository extends JpaRepository<Hire, Long> {
}
