package shop.goodcasting.api.board.hireboad.domain;

import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Table(name = "hire_boards")
@Entity
public class HireBoard extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "hire_board_id")
    private long hireBoardId;

    @Column private String title;
    @Column private String content;
    @Column private String regDate;
}
