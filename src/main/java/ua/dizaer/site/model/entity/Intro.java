package ua.dizaer.site.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="intro")
public class Intro {
    public static final String VIDEO_FORMAT="mp4";
    public static final String POSTER_FORMAT="png";
    @Id
    private String name;

    private String posterName;
    private String videoName;

    public Intro() {
    }

    public Intro(String name, String posterName, String videoName) {
        this.name = name;
        this.posterName = posterName;
        this.videoName = videoName;
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
}
