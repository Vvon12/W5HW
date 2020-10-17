package au.edu.unsw.business.infs2605.W4E1IndiefyLoginScreen;

public class Track {
    private String track;

    private String artist;

    private String album;

    private String genre;

    public Track(){
        this("", "", "", "");
    }

    public Track(String track, String artist, String album, String genre){
        this.track = track;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public void setTrack(String track){
        this.track = track;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getTrack(){
        return this.track;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getAlbum(){
        return this.album;
    }

    public String getGenre(){
        return this.genre;
    }
}
