package shop.goodcasting.api.common.domain;

import javax.persistence.*;

@Table(name = "hire_profiles")
@Entity
public class Recommend {

    @Id
    @GeneratedValue
    @Column(name = "hire_profile_id") private long hireProfileId;

}
