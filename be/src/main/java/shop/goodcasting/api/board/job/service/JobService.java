package shop.goodcasting.api.board.job.service;

import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.job.domain.Job;
import shop.goodcasting.api.board.job.domain.JobDTO;

@Service
public interface JobService {
    Job update(JobDTO jobDTO);

}
