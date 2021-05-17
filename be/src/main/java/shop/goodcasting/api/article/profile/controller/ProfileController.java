package shop.goodcasting.api.article.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.profile.domain.Profile;
import shop.goodcasting.api.article.profile.repository.ProfileRepository;
import shop.goodcasting.api.article.profile.service.ProfileService;
import shop.goodcasting.api.article.profile.service.ProfileServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profiles")
public class ProfileController {
    private final ProfileServiceImpl service;
    private final ProfileRepository repo;

    @PostMapping("/save")
    public ResponseEntity<Long> save(Profile profile) {
        return ResponseEntity.ok(service.save(profile));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Profile>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Profile>> findById(@PathVariable long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Profile id) {
        return ResponseEntity.ok(service.delete(id));
    }
    @PutMapping("/update")
    public ResponseEntity<Profile> update(@RequestBody Profile profile) {
        return ResponseEntity.ok(repo.save(profile));
    }

}
