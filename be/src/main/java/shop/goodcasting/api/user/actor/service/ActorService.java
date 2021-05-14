package shop.goodcasting.api.user.actor.service;

import shop.goodcasting.api.user.actor.domain.Actor;
import shop.goodcasting.api.user.actor.domain.ActorDTO;

public interface ActorService {
    Actor signup(Actor actor);
    ActorDTO signin(Actor actor);
}