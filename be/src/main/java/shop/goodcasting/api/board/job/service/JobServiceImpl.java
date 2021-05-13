package shop.goodcasting.api.board.job.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.job.repository.JobRepository;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobRepository repo;
}
