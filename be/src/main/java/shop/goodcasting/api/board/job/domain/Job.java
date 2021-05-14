package shop.goodcasting.api.board.job.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.goodcasting.api.common.domain.BaseEntity;

import javax.persistence.*;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobs")
public class Job extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id") private Long jobId;


    @Column private String title;
    @Column private String contents;

    public void changeTitle(String title) {
        this.title = title;
    }
    public void changeContents(String contents) {
        this.contents = contents;
    }

}
