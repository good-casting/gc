package shop.goodcasting.api.user.actor.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component @Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActorDTO {
    private Long actorId;
    private String username;
    private String password;
    private String name;
    private String gender;
    private String birthday;
    private String phone;
    private String authority;
    private String height;
    private String weight;
    private String agency;
    private boolean major;

//    private List<Role> roles;

    private String token;


}
