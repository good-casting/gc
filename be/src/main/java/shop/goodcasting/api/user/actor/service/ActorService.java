package shop.goodcasting.api.user.actor.service;

import shop.goodcasting.api.user.actor.domain.Actor;
import shop.goodcasting.api.user.actor.domain.ActorDTO;

public interface ActorService {
    Actor signup(Actor actor);
    ActorDTO signin(Actor actor);

    default ActorDTO entity2Dto(Actor actor){
        return ActorDTO.builder()
                .actorId(actor.getActorId())
                .password(actor.getPassword())
                .name(actor.getName())
                .birthday(actor.getBirthday())
                .height(actor.getHeight())
                .weight(actor.getWeight())
                .agency(actor.getAgency())
                .phone(actor.getPhone())
                .major(actor.isMajor())
                .build();
    }
}