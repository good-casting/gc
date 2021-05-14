package shop.goodcasting.api.article.hire.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class HireDTO {
    private Long hiresId;
    private String title;
    private String contents;
}
