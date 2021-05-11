package shop.goodcasting.api.user.actor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.user.actor.repository.ActorRepository;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {
    private final ActorRepository repo;
}
