package shop.goodcasting.api.user.actor.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ActorDTO {
    private Long actorId;
    private String username;
    private String password;
    private String name;
    private String gender;
    private String birthday;
    private String phoneNumber;
    private String authority;
    private String height;
    private String weight;
    private String agency;
    private Boolean majority;

//    private List<Role> roles;

    private String token;
}
