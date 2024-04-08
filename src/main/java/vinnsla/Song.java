package vinnsla;

public class Song {
    private String filePath;
    private String songName;
    private String artistName;
    private String genre;

    public Song(String filePath, String songName, String artistName, String genre) {
        this.filePath = filePath;
        this.songName = songName;
        this.artistName = artistName;
        this.genre = genre;
    }

    // Getters and Setters
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
