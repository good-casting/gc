package shop.goodcasting.api.board.job.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id") private Long jobId;

}
