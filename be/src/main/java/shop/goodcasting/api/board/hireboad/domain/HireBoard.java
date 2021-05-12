package shop.goodcasting.api.board.hireboad.domain;

import javax.persistence.*;

@Table(name = "hire_boards")
@Entity
public class HireBoard {
    @Id
    @GeneratedValue
    @Column(name = "hire_board_id")
    private long hireBoardId;

    @Column private String title;
    @Column private String contents;
    @Column private String regDate;
}
