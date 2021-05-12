package shop.goodcasting.api.article.hire.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.article.hire.repository.HireRepository;

@Service
@RequiredArgsConstructor
public class HireServiceImpl implements HireService {
    private final HireRepository repo;
}
