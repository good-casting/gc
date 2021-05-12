package shop.goodcasting.api.user.producer.domain;

import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "producers")
public class Producer extends BaseEntity {
    @Id @GeneratedValue
    @Column(name = "producer_id") private long producerId;

    @Column(unique = true) private String username;
    @Column private String name;
    @Column private String password;
    @Column private String email;
    @Column private String agency;
    @Column private String phone;
    @Column private String position;
    @Column private String regDate;
}
