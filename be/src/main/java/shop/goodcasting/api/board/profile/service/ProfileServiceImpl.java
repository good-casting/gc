package shop.goodcasting.api.board.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.profile.repository.ProfileRepository;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository repo;
}
