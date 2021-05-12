package shop.goodcasting.api.common.domain;

import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.profile.domain.Profile;

import javax.persistence.*;

@Table(name = "hire_profiles")
@Entity
public class HireProfile extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "hire_profile_id")
    private long hireProfileId;

    @Column private String regDate;

    @ManyToOne
    @JoinColumn(name = "hire_id")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Hire hire;
}
