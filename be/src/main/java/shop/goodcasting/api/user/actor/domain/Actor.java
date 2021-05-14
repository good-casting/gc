package shop.goodcasting.api.user.actor.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "actors")
public class Actor extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("actor_id")
    @Column(name = "actor_id")
    private Long actorId;

    @Column(unique = true) private String username;
    @Column private String password;
    @Column private String name;
    @Column private String gender;
    @Column private String birthday;
    @Column(unique = true) private String phone;
    @Column private String authority;
    @Column private String height;
    @Column private String weight;
    @Column private String agency;
    @Column private boolean major;

//    @ElementCollection(fetch = FetchType.EAGER)
//    List<Role> roles;
}
