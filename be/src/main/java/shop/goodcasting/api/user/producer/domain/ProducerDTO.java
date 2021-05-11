package shop.goodcasting.api.user.producer.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProducerDTO {
    private long producersId;
    private String username;
    private String password;
    private String email;
}
