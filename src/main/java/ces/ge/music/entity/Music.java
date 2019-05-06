package ces.ge.music.entity;

public class Music {

    private String musicName;
    private String poster;
    private String url;
    private String playCount;
    private String singer;
    private String album;
    private String lrc;

    public Music() {
    }

    public Music(String musicName, String poster, String url, String playCount, String singer, String album, String lrc) {
        this.musicName = musicName;
        this.poster = poster;
        this.url = url;
        this.playCount = playCount;
        this.singer = singer;
        this.album = album;
        this.lrc = lrc;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLrc() {
        return lrc;
    }

    public void setLrc(String lrc) {
        this.lrc = lrc;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicName='" + musicName + '\'' +
                ", poster='" + poster + '\'' +
                ", url='" + url + '\'' +
                ", playCount='" + playCount + '\'' +
                ", singer='" + singer + '\'' +
                ", album='" + album + '\'' +
                ", lrc='" + lrc + '\'' +
                '}';
    }
}
