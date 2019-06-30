package ces.ge.music.entity;

public class Video {

    private String videoName;
    private String poster;
    private String url;
    private String playCount;
    private String singer;
    private int videoId;

    public Video() {
    }

    public Video(String videoName, String poster, String url, String playCount, String singer,int videoId) {
        this.videoName = videoName;
        this.poster = poster;
        this.url = url;
        this.playCount = playCount;
        this.singer = singer;
        this.videoId = videoId;
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

    public String getPlayCount() {
        return playCount;
    }

    public void setPlayCount(String playCount) {
        this.playCount = playCount;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", poster='" + poster + '\'' +
                ", url='" + url + '\'' +
                ", playCount='" + playCount + '\'' +
                ", singer='" + singer + '\'' +
                ", videoId='" + videoId + '\'' +
                '}';
    }

}
