package shop.goodcasting.api.board.job.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.job.domain.Job;
import shop.goodcasting.api.board.job.domain.JobDTO;
import shop.goodcasting.api.board.job.repository.JobRepository;
import shop.goodcasting.api.common.service.AbstractService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JobServiceImpl extends AbstractService<Job> implements JobService {
    private final JobRepository repo;

    @Override
    public Job update(JobDTO jobDTO) {
        Optional<Job> result = repo.findById(jobDTO.getJobId());

        if (result.isPresent()) {
            Job job = result.get();
            job.changeTitle(jobDTO.getTitle());
            job.changeContents(jobDTO.getContents());

            repo.save(job);
        }
        return null;
    }

    @Override
    public long save(Job job) {
        repo.save(job);
        return 1L;
    }

    @Override
    public Optional<Job> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public List<Job> findAll() {
        return repo.findAll();
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public Optional<Job> getOne(long id) {
        return Optional.of(repo.getOne(id));
    }

    @Override
    public long delete(Job job) {
        repo.delete(job);
        return (findById(job.getJobId()).orElse(null) == null ) ? 1L : 0L;
    }

    @Override
    public boolean existById(long id) {
        return repo.existsById(id);
    }
}
