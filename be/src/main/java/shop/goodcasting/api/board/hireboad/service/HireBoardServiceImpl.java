package shop.goodcasting.api.board.hireboad.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.board.hireboad.domain.HireBoardDTO;
import shop.goodcasting.api.board.hireboad.repository.HireBoardRepository;
import shop.goodcasting.api.common.service.AbstractService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HireBoardServiceImpl extends AbstractService<HireBoard> implements HireBoardService {

    private final HireBoardRepository repo;

    @Override
    public Long save(HireBoard hireBoard) {
        repo.save(hireBoard);
        return 1L;
    }

    @Override
    public Optional<HireBoard> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<HireBoard> findAll() {
        return repo.findAll();
    }

    @Override
    public Long count() {
        return repo.count();
    }

    @Override
    public Optional<HireBoard> getOne(Long id) {
        return Optional.of(repo.getOne(id));
    }

    @Override
    public Long delete(HireBoard hireBoard) {
        repo.delete(hireBoard);
        return (findById(hireBoard.getHireBoardId()).orElse(null) == null) ? 1L : 0L;
    }

    @Override
    public Boolean existById(Long id) {
        return repo.existsById(id);
    }

    @Override
    public HireBoard update(HireBoardDTO hireBoardDTO) {

        Optional<HireBoard> result = repo.findById(hireBoardDTO.getHireBoardId());

        if (result.isPresent()){
            HireBoard hireBoard = result.get();

            repo.save(hireBoard);
        }
        return null;
    }

}
