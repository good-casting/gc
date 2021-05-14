package shop.goodcasting.api.user.producer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.goodcasting.api.user.producer.domain.Producer;
import shop.goodcasting.api.user.producer.domain.ProducerDTO;
import shop.goodcasting.api.user.producer.repository.ProducerRepository;
import shop.goodcasting.api.user.producer.service.ProducerServiceImpl;

import java.util.List;
import java.util.Optional;

@Log
@RestController
@RequiredArgsConstructor
@RequestMapping("/producers")
public class ProducerController {
    private final ProducerServiceImpl service;
    private final ProducerRepository repo;
    private final ModelMapper modelMapper;

    @GetMapping("/list")
    public ResponseEntity<List<Producer>> producerList(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/signup")
    public ResponseEntity<Producer> signup(@RequestBody Producer producer){
        return ResponseEntity.ok(service.signup(producer));
    }

    @PostMapping("/signin")
    public ResponseEntity<ProducerDTO> signin(@RequestBody ProducerDTO producerDTO){
        return ResponseEntity.ok(service.signin(modelMapper.map(producerDTO, Producer.class)));
    }

    @GetMapping("/detail")
    public ResponseEntity<Optional<Producer>> detail(@RequestBody Producer producer){
        return ResponseEntity.ok(service.findById(producer.getProducerId()));
    }

    @PutMapping("/update")
    public ResponseEntity<Producer> update(@RequestBody Producer producer){
        return ResponseEntity.ok(repo.save(producer));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Long> delete(@RequestBody Producer producer){
        return ResponseEntity.ok(service.delete(producer));
    }

}
