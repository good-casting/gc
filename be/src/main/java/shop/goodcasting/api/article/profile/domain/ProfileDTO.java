package shop.goodcasting.api.article.profile.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@Component
public class ProfileDTO {
    private long resumesId;
    boolean privacy;
    private String contents;
    private String career;
}
