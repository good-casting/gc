package shop.goodcasting.api.board.hire.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.hire.repository.HireRepository;

@Service
@RequiredArgsConstructor
public class HireServiceImpl implements HireService {
    private final HireRepository repo;
}
