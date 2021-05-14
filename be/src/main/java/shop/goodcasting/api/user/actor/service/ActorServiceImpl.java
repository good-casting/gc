package shop.goodcasting.api.user.actor.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.common.service.AbstractService;
import shop.goodcasting.api.user.actor.domain.Actor;
import shop.goodcasting.api.user.actor.domain.ActorDTO;
import shop.goodcasting.api.user.actor.repository.ActorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log
@Service
@RequiredArgsConstructor
public class ActorServiceImpl extends AbstractService<Actor> implements ActorService {

    private final ActorRepository repo;
    private final ModelMapper modelMapper;

    @Override
    public Long save(Actor actor) {
        return (repo.save(actor) != null) ? 1L : 0L;
    }

    @Override
    public Optional<Actor> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Actor> findAll() {
        return repo.findAll();
    }

    @Override
    public Long count() {
        return repo.count();
    }

    @Override
    public Optional<Actor> getOne(Long id) {
        return Optional.ofNullable(repo.getOne(id));
    }

    @Override
    public Long delete(Actor actor) {
        repo.delete(actor);
        return repo.findById(actor.getActorId()).orElse(null) == null ? 1L : 0L;
    }

    @Override
    public boolean existById(Long id) {
        return repo.existsById(id);
    }

    @Override
    public Actor signup(Actor actor) {
        return repo.save(actor);
    }

    @Override
    public ActorDTO signin(Actor actor) {
        ActorDTO userDto = modelMapper.map(actor, ActorDTO.class);
        repo.signin(actor.getUsername(), actor.getPassword());
        return userDto;
    }

}


