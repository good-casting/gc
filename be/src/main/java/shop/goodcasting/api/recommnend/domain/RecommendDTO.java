package shop.goodcasting.api.recommnend.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Component
public class RecommendDTO {
    private long recommendId;
}
