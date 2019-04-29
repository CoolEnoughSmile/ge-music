package ces.ge.music.entity;

public class Video {

    private String videoName;
    private String poster;
    private String url;
    private String palyCount;
    private String singer;

    public Video() {
    }

    public Video(String videoName, String poster, String url, String palyCount, String singer) {
        this.videoName = videoName;
        this.poster = poster;
        this.url = url;
        this.palyCount = palyCount;
        this.singer = singer;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPalyCount() {
        return palyCount;
    }

    public void setPalyCount(String palyCount) {
        this.palyCount = palyCount;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", poster='" + poster + '\'' +
                ", url='" + url + '\'' +
                ", palyCount='" + palyCount + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

}
