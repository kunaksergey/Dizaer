package ua.dizaer.site.model.entity;

import javax.persistence.*;

@Entity
@Table(name="intro_details")
public class IntroDetails {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="download_link")
    private String downloadLink;

    @Column(name="client")
    private String client;

    @Column(name="dual_")
    private String dual;

    @Column(name="date_made")
    private String dateMade;

    @Column(name="light_room")
    private String lightRoom;

    @Column(name="cc")
    private String cc;

    @Column(name="song")
    private String song;

    @Column(name="song_link")
    private String songLink;

    @Column(name="font")
    private String font;

    @Column(name="letter_pack")
    private String letterPack;

    @Column(name="mats")
    private String mats;

    @Column(name="shake")
    private String shake;

    @Column(name="style")
    private String style;

    @Column(name="inspirations")
    private String inspirations;

    @Column(name="shockwaves")
    private String shockwaves;

    @Column(name="obj")
    private String obj;

    @Column(name="other")
    private String other;

    @Column(name="render_option")
    private String renderOption;

    @Column(name="work_time")
    private String workTime;

    @Column(name="render_time")
    private String renderTime;

    @Column(name="quality")
    private String quality;

    @Column(name="program_used")
    private String programUsed;

    @Column(name="format")
    private String format;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="intro_id")
    private Intro intro;

    public Intro getIntro() {
        return intro;
    }

    public void setIntro(Intro intro) {
        this.intro = intro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDual() {
        return dual;
    }

    public void setDual(String dual) {
        this.dual = dual;
    }

    public String getDateMade() {
        return dateMade;
    }

    public void setDateMade(String dateMade) {
        this.dateMade = dateMade;
    }

    public String getLightRoom() {
        return lightRoom;
    }

    public void setLightRoom(String lightRoom) {
        this.lightRoom = lightRoom;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSongLink() {
        return songLink;
    }

    public void setSongLink(String songLink) {
        this.songLink = songLink;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getLetterPack() {
        return letterPack;
    }

    public void setLetterPack(String letterPack) {
        this.letterPack = letterPack;
    }

    public String getMats() {
        return mats;
    }

    public void setMats(String mats) {
        this.mats = mats;
    }

    public String getShake() {
        return shake;
    }

    public void setShake(String shake) {
        this.shake = shake;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getInspirations() {
        return inspirations;
    }

    public void setInspirations(String inspirations) {
        this.inspirations = inspirations;
    }

    public String getShockwaves() {
        return shockwaves;
    }

    public void setShockwaves(String shockwaves) {
        this.shockwaves = shockwaves;
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRenderOption() {
        return renderOption;
    }

    public void setRenderOption(String renderOption) {
        this.renderOption = renderOption;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getRenderTime() {
        return renderTime;
    }

    public void setRenderTime(String renderTime) {
        this.renderTime = renderTime;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getProgramUsed() {
        return programUsed;
    }

    public void setProgramUsed(String programUsed) {
        this.programUsed = programUsed;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
