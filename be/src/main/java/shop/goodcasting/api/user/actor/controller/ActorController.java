package shop.goodcasting.api.user.actor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.user.actor.service.ActorServiceImpl;

@RestController
@RequiredArgsConstructor
public class ActorController {
    private final ActorServiceImpl service;
}
