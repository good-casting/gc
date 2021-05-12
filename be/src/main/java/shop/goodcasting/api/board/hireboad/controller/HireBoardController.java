package shop.goodcasting.api.board.hireboad.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.board.hireboad.service.HireBoardServiceImpl;

@RestController
@RequiredArgsConstructor
public class HireBoardController {
    private final HireBoardServiceImpl service;
}
