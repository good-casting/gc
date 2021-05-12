package shop.goodcasting.api.board.hireboad.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.hireboad.repository.HireBoardRepository;

@Service
@RequiredArgsConstructor
public class HireBoardServiceImpl implements HireBoardService {
    private final HireBoardRepository repo;
}
