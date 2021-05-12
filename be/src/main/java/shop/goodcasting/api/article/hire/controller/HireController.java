package shop.goodcasting.api.article.hire.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.article.hire.service.HireServiceImpl;

@RestController
@RequiredArgsConstructor
public class HireController {
    private final HireServiceImpl service;
}
