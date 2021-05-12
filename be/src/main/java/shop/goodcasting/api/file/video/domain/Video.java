package shop.goodcasting.api.file.video.domain;

import shop.goodcasting.api.article.profile.domain.Profile;

import javax.persistence.*;

@Table(name = "videos")
@Entity
public class Video {
    @Id
    @GeneratedValue
    @Column(name = "video_id")
    private long videoId;

    @Column(name = "file_size") private String fileSize;
    @Column(name = "file_name") private String fileName;
    @Column(name = "saved_file_name") private String savedFileName;
    @Column private String regDate;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
