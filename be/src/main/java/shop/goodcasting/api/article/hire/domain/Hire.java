package shop.goodcasting.api.article.hire.domain;

import lombok.*;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.common.domain.BaseEntity;
import shop.goodcasting.api.common.domain.HireProfile;
import shop.goodcasting.api.user.producer.domain.Producer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Data
@Table(name = "hires")
public class Hire extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hire_id") private Long hireId;

    @Column(name = "hire_title")
    private String hireTitle; //공고제목
    @Column private String title; //작품제목
    @Column private String cast;    //배역
    @Column private String filming; //촬영기간
    @Column private String guarantee; //출연료
    @Column private String personnel; //모집인원
    @Column private String deadline; //공고마감일
    @Column private String contents; //내용

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;


    @OneToMany(mappedBy = "hire" ,fetch = FetchType.EAGER)
    private List<HireProfile> profiles;

    @ManyToOne
    @JoinColumn(name = "hire_board_id")
    private HireBoard hireBoard;

}