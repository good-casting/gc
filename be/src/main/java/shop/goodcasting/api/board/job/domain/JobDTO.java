package shop.goodcasting.api.board.job.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class JobDTO {
    private long jobId;
    private String title;
    private String contents;
}
