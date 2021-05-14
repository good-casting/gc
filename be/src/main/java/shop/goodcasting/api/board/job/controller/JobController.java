package shop.goodcasting.api.board.job.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.goodcasting.api.board.job.domain.Job;
import shop.goodcasting.api.board.job.domain.JobDTO;
import shop.goodcasting.api.board.job.service.JobService;
import shop.goodcasting.api.board.job.service.JobServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/job")
public class JobController {

    private final JobServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<Long> save(@RequestBody Job job){
        return ResponseEntity.ok(service.save(job));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Job>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Job>> findById(@PathVariable long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Job> update(@RequestBody JobDTO jobDTO) {
        return ResponseEntity.ok(service.update(jobDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Job id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
