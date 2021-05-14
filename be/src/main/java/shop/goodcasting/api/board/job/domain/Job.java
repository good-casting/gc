package shop.goodcasting.api.board.job.domain;

import lombok.Getter;
import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "jobs")
public class Job extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id") private Long jobId;
}
