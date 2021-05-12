package shop.goodcasting.api.user.producer.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@Component
public class ProducerDTO {
    private long producersId;
    private String username;
    private String password;
    private String email;
    private String agency;
    private String phone;
    private String position;
}
