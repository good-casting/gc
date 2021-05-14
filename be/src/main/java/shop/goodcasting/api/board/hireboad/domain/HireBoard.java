package shop.goodcasting.api.board.hireboad.domain;

import lombok.*;
import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hire_boards")
public class HireBoard extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hire_board_id")
    private Long hireBoardId;


    @Column private String title;
    @Column private String contents;

    public void changeTitle(String title) {
        this.title = title;
    }
    public void changeContents(String contents) {
        this.contents = contents;
    }

}
