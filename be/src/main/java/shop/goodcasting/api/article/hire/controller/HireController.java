package shop.goodcasting.api.board.hire.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.board.hire.service.HireServiceImpl;

@RestController
@RequiredArgsConstructor
public class HireController {
    private final HireServiceImpl service;
}
