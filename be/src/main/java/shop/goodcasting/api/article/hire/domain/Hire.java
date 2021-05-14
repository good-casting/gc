package shop.goodcasting.api.article.hire.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.common.domain.BaseEntity;
import shop.goodcasting.api.common.domain.HireProfile;
import shop.goodcasting.api.user.producer.domain.Producer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    public void changeTitle(String title) {
        this.title = title;
    }
    public void changeContents(String contents){
        this.contents = contents;
    }
}