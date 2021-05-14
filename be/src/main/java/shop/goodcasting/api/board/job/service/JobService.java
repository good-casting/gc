package shop.goodcasting.api.board.job.service;

import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.job.domain.Job;
import shop.goodcasting.api.board.job.domain.JobDTO;

@Service
public interface JobService {
    Job update(JobDTO jobDTO);

    default Job dtoToEntity(JobDTO jobDTO){
        return Job.builder()
                .jobId(jobDTO.getJobId())
                .title(jobDTO.getTitle())
                .contents(jobDTO.getContents())
                .build();
    }
}
