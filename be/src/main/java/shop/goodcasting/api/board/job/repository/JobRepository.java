package shop.goodcasting.api.board.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.board.job.domain.Job;
import shop.goodcasting.api.board.job.domain.JobDTO;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
