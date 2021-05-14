package shop.goodcasting.api.article.hire.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.hire.domain.HireDTO;
import shop.goodcasting.api.article.hire.repository.HireRepository;
import shop.goodcasting.api.common.service.AbstractService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HireServiceImpl extends AbstractService<Hire> implements HireService {
    private final HireRepository repo;

    @Override
    public Hire update(HireDTO hireDTO) {
        Optional<Hire> result = repo.findById(hireDTO.getHiresId());

        if (result.isPresent()) {
            Hire hire = result.get();

            repo.save(hire);

        }
        return null;
    }

    @Override
    public Long save(Hire hire) {
        repo.save(hire);
        return 1L;
    }

    @Override
    public Optional<Hire> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Hire> findAll() {
        return repo.findAll();
    }

    @Override
    public Long count() {
        return repo.count();
    }

    @Override
    public Optional<Hire> getOne(Long id) {
        return Optional.of(repo.getOne(id));
    }

    @Override
    public Long delete(Hire hire) {
        repo.delete(hire);
        return (findById(hire.getHireId()).orElse( null ) == null) ? 1L : 0L;
    }

    @Override
    public Boolean existById(Long id) {
        return repo.existsById(id);
    }
}
