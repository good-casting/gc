package shop.goodcasting.api.article.hire.domain;

import lombok.Getter;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.common.domain.BaseEntity;
import shop.goodcasting.api.common.domain.HireProfile;
import shop.goodcasting.api.user.producer.domain.Producer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "hires")
public class Hire extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "hire_id") private long hireId;

    @Column private String title;
    @Column private String contents;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    @OneToMany(mappedBy = "hire")
    private List<HireProfile> profiles = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "hire_board_id")
    private HireBoard hireBoard;
}