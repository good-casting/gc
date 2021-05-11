package shop.goodcasting.api.user.producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.user.producer.repository.ProducerRepository;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {
    private final ProducerRepository repo;
}
