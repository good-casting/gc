package shop.goodcasting.api.board.hireboad.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
    public long save(HireBoard hireBoard) {
        repo.save(hireBoard);
        return 1L;
    }

    @Override
    public Optional<HireBoard> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public List<HireBoard> findAll() {
        return repo.findAll();
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public Optional<HireBoard> getOne(long id) {
        return Optional.of(repo.getOne(id));
    }

    @Override
    public long delete(HireBoard hireBoard) {
        repo.delete(hireBoard);
        return (findById(hireBoard.getHireBoardId()).orElse(null) == null) ? 1L : 0L;
    }

    @Override
    public boolean existById(long id) {
        return repo.existsById(id);
    }

    @Override
    public HireBoard update(HireBoardDTO hireBoardDTO) {

        Optional<HireBoard> result = repo.findById(hireBoardDTO.getHireBoardId());

        if (result.isPresent()){
            HireBoard hireBoard = result.get();

            hireBoard.changeTitle(hireBoardDTO.getTitle());
            hireBoard.changeContents(hireBoardDTO.getContents());

            repo.save(hireBoard);
        }
        return null;
    }

}
