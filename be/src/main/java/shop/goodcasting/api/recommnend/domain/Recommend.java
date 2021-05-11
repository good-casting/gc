package shop.goodcasting.api.recommnend.domain;

import javax.persistence.*;

@Entity
@Table(name = "recommends")
public class Recommend {

    @Id
    @GeneratedValue
    @Column(name = "recommend_id") private long recommendId;
}
