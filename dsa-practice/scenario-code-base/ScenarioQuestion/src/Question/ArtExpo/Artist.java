package Question.ArtExpo;

import java.time.LocalTime;

public class Artist {
     public String name;
     public LocalTime time;
	
     public Artist(String name, LocalTime time) {
		this.name = name;
		this.time = time;
	 }
     
    @Override
    public String toString() {
    	return "\nArtist Name : "+this.name+" | Time : "+this.time;
    }
}
