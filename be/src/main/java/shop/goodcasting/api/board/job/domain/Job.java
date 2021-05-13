package shop.goodcasting.api.board.job.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue
    @Column(name = "job_id") private long jobId;

    @Column private String title;
    @Column private String contents;
}
