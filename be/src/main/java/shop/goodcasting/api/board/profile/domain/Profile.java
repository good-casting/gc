package shop.goodcasting.api.board.profile.domain;

import shop.goodcasting.api.recommnend.domain.Recommend;
import shop.goodcasting.api.user.actor.domain.Actor;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "recommend_id")
    private Recommend recommend;
}
