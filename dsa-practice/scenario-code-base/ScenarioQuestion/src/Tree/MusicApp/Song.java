package Tree.MusicApp;

public class Song {
    int trackId;
    String title;
    String artist;
    
    Song left, right;

    public Song(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
        left = right = null;
    }

    @Override
    public String toString() {
        return trackId + " - " + title + " (" + artist + ")";
    }
}
