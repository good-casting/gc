package shop.goodcasting.api.user.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.goodcasting.api.user.login.domain.UserVO;

public interface UserRepository extends JpaRepository<UserVO, Long> {
    Boolean existByUsername(String username);
}
