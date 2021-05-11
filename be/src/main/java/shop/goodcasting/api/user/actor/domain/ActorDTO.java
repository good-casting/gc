package shop.goodcasting.api.user.actor.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class ActorDTO {
    private long actorsId;
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
    private boolean majority;

//    private List<Role> roles;

    private String token;
}
