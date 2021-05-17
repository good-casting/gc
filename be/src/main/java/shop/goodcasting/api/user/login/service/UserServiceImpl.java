package shop.goodcasting.api.user.login.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.goodcasting.api.user.login.domain.UserVO;
import shop.goodcasting.api.user.login.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repo;

    @Override
    public String signup(UserVO userVO) {
        if (!repo.existByUsername(userVO.getUsername())) {
            userVO.builder().build();
        }

        return null;
    }
}
