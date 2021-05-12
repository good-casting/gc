package shop.goodcasting.api.article.hire.domain;

import lombok.Data;
import shop.goodcasting.api.common.domain.HireProfile;
import shop.goodcasting.api.user.producer.domain.Producer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hires")
public class Hire {
    @Id
    @GeneratedValue
    @Column(name = "hire_id") private long hireId;

    @Column private String title;
    @Column private String contents;
    @Column private String regDate;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    @OneToMany(mappedBy = "hire")
    private List<HireProfile> profiles = new ArrayList<>();
}