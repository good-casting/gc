package shop.goodcasting.api.common.crawl;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.board.hireboad.domain.HireBoardDTO;

import java.io.IOException;
import java.util.List;

@RestController
@Log
@RequiredArgsConstructor
@RequestMapping("/crawl")
public class CrawlController {
    private final CrawlServiceImpl service;

    @GetMapping("/hire")
    public ResponseEntity<List<HireBoardDTO>> fetchcastpick() throws IOException {
        log.info("fetchcastpick접속");
        return ResponseEntity.ok(service.saveAll());
    }
    @GetMapping("/hire_filmmakers")
    public ResponseEntity<List<HireBoardDTO>> fetchfilm() throws IOException {
        log.info("fetchfilm접속");
        return ResponseEntity.ok(service.fetchFilm());
    }
}