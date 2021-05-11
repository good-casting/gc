package shop.goodcasting.api.user.actor.domain;

import javax.persistence.*;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @GeneratedValue
    @Column(name = "actor_id")
    private long actorId;

    @Column(unique = true) private String username;
    @Column private String password;
    @Column private String name;
    @Column private String gender;
    @Column private String birthday;
    @Column(name = "phone_number", unique = true) private String phoneNumber;
    @Column private String authority;
    @Column private String height;
    @Column private String weight;
    @Column private String agency;
    @Column private boolean major;

//    @ElementCollection(fetch = FetchType.EAGER)
//    List<Role> roles;
}
