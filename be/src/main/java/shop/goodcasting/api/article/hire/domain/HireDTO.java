package shop.goodcasting.api.board.hire.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class HireDTO {
    private long hiresId;
    private String title;
    private String contents;
}
