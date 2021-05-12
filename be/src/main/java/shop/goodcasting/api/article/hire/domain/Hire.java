package shop.goodcasting.api.board.hire.domain;

import shop.goodcasting.api.board.profile.domain.Profile;
import shop.goodcasting.api.user.producer.domain.Producer;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hires")
public class Hire {
    @Id
    @GeneratedValue
    @Column(name = "hire_id") private long hireId;

    @Column private String title;

    @Column private String contents;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    @ManyToOne
    @JoinTable(name = "hire_profiles",
            joinColumns = @JoinColumn(name = "hire_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Set<Profile> profiles = new HashSet<>();
}
