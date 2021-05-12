package shop.goodcasting.api.board.profile.domain;

import shop.goodcasting.api.board.hire.domain.Hire;
import shop.goodcasting.api.user.actor.domain.Actor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue
    @Column(name = "profile_id")
    private long profileId;

    @Column
    private String career;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @ManyToMany(mappedBy = "profile")
    private Set<Hire> hires = new HashSet<>();
}