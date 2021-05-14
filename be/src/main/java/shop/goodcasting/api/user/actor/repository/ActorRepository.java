package shop.goodcasting.api.user.actor.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.user.actor.domain.Actor;
import shop.goodcasting.api.user.actor.domain.ActorDTO;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    boolean existsByUsername(String username);

    @Query("select a from Actor a where a.username = :username and a.password = :password ")
    Actor signin(@Param("username") String username, @Param("password") String password);
}