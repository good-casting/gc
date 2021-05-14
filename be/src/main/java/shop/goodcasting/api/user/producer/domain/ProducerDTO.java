package shop.goodcasting.api.user.producer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProducerDTO {
    private Long producerId;
    private String username;
    private String password;
    private String email;
    private String agency;
    private String phone;
    private String position;
}
