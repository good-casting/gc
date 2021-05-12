package shop.goodcasting.api.file.photo.domain;

import shop.goodcasting.api.article.profile.domain.Profile;

import javax.persistence.*;

@Table(name = "photos")
@Entity
public class Photo {
    @Id
    @GeneratedValue
    @Column(name = "photo_id")
    private long photoId;

    @Column(name = "file_size") private String fileSize;
    @Column(name = "file_name") private String fileName;
    @Column(name = "saved_file_name") private String savedFileName;
    @Column private String regDate;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
