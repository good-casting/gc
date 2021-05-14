package shop.goodcasting.api.user.producer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.goodcasting.api.user.producer.domain.Producer;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {
    @Query("select p from Producer p where p.username = :username and p.password = :password ")
    Producer signin(@Param("username") String username, @Param("password") String password);
}