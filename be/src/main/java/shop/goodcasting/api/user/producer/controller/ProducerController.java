package shop.goodcasting.api.user.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.user.producer.service.ProducerServiceImpl;

@RestController
@RequiredArgsConstructor
public class ProducerController {
    private final ProducerServiceImpl service;

}
