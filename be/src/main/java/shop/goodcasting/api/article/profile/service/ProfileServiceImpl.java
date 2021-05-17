package shop.goodcasting.api.article.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.hire.domain.HireDTO;
import shop.goodcasting.api.article.profile.domain.Profile;
import shop.goodcasting.api.article.profile.domain.ProfileDTO;
import shop.goodcasting.api.article.profile.repository.ProfileRepository;
import shop.goodcasting.api.common.service.AbstractService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl extends AbstractService<Profile> implements ProfileService {
    private final ProfileRepository repo;

    @Override
    public Long save(Profile profile) {
        repo.save(profile);
        return 1L;
    }

    @Override
    public Optional<Profile> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Profile> findAll() {
        return repo.findAll();
    }

    @Override
    public Long count() {
        return repo.count();
    }

    @Override
    public Optional<Profile> getOne(Long id) {
        return Optional.of(repo.getOne(id));
    }

    @Override
    public Long delete(Profile profile) {
        repo.delete(profile);
        return (findById(profile.getProfileId()).orElse( null ) == null) ? 1L : 0L;
    }

    @Override
    public Boolean existById(Long id) {
        return repo.existsById(id);
    }

    @Override
    public Profile update(ProfileDTO profileDTO) {
        Optional<Profile> result = repo.findById(profileDTO.getResumesId());

        if (result.isPresent()) {
            Profile profile = result.get();

            repo.save(profile);

        }
        return null;
    }
}
