package shop.goodcasting.api.board.hire.domain;

import shop.goodcasting.api.recommnend.domain.Recommend;
import shop.goodcasting.api.user.producer.domain.Producer;

import javax.persistence.*;

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
    @JoinColumn(name = "recommend_id")
    private Recommend recommend;
}
