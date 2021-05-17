package shop.goodcasting.api.article.hire.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.hire.domain.HireDTO;
import shop.goodcasting.api.article.hire.repository.HireRepository;
import shop.goodcasting.api.article.hire.service.HireServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hires")
public class HireController {

    private final HireServiceImpl service;
    private final HireRepository repo;

    @PostMapping("/save")
    public ResponseEntity<Long> save(@RequestBody Hire hire) {
        return ResponseEntity.ok(service.save(hire));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Hire>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Hire>> findById(@PathVariable long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Hire id) {
        return ResponseEntity.ok(service.delete(id));
    }
    @PutMapping("/update")
    public ResponseEntity<Hire> update(@RequestBody Hire hire) {
        return ResponseEntity.ok(repo.save(hire));
    }

}
