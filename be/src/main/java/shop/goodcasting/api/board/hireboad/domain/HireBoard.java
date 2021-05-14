package shop.goodcasting.api.board.hireboad.domain;

import lombok.Getter;
import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "hire_boards")
public class HireBoard extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hire_board_id")
    private Long hireBoardId;

}
