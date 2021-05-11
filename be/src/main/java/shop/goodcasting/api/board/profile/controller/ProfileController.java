package shop.goodcasting.api.board.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.board.profile.service.ProfileServiceImpl;

@RestController
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileServiceImpl service;
}
