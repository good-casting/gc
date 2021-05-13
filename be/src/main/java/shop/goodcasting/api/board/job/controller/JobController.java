package shop.goodcasting.api.board.job.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.board.job.service.JobService;

@RestController
@RequiredArgsConstructor
public class JobController {
    private final JobService service;
}
