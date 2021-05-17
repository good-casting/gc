package shop.goodcasting.api.user.login.domain;

import lombok.Builder;
import lombok.Getter;
import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Builder
@Getter
@Table(name = "users")
@Entity
public class UserVO extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") private Long userId;
    @Column(unique = true, nullable = false) private String username;
    @Size(min = 8, message = "Minimum password length: 8")
    @Column(nullable = false) private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles;
}
