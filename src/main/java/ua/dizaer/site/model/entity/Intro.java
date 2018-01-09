package ua.dizaer.site.model.entity;

import javax.persistence.*;

@Entity
@Table(name="intro")
public class Intro {
    public static final String VIDEO_FORMAT="mp4";
    public static final String POSTER_FORMAT="png";
    @Id
    @Column(name = "name")
    private String name;

    @Column(name="poster_name")
    private String posterName;

    @Column(name="video_name")
    private String videoName;

    @Column(name="description")
    private String description;

    @OneToOne(mappedBy = "intro")
     private IntroDetails introDetails;

    public Intro() {
    }

    public Intro(String name, String posterName, String videoName) {
        this.name = name;
        this.posterName = posterName;
        this.videoName = videoName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public IntroDetails getIntroDetails() {
        return introDetails;
    }

    public void setIntroDetails(IntroDetails introDetails) {
        this.introDetails = introDetails;
    }
}
