package shop.goodcasting.api.board.hireboad.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.board.hireboad.domain.HireBoardDTO;
import shop.goodcasting.api.board.hireboad.service.HireBoardServiceImpl;

import java.util.List;
import java.util.Optional;

@RequestMapping("/hireboards")
@RestController
@RequiredArgsConstructor
public class HireBoardController {

    private final HireBoardServiceImpl service;
    private final ModelMapper modelMapper;

    @PostMapping("/save")
    public ResponseEntity<Long> save(@RequestBody HireBoard hireBoard) {

        return ResponseEntity.ok(service.save(hireBoard));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<HireBoard>> findAll() {

        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<HireBoard>> findById(@PathVariable long id) {

        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable HireBoard id) {

        return ResponseEntity.ok(service.delete(id));

    }

    @PutMapping("/update")
    public ResponseEntity<HireBoard> update(@RequestBody HireBoardDTO hireBoardDTO) {

        return ResponseEntity.ok(service.update(hireBoardDTO));
    }



    }
