package shop.goodcasting.api.board.profile.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProfileDTO {
    private long resumesId;
    private String career;
}
