package shop.goodcasting.api.board.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.board.profile.domain.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
