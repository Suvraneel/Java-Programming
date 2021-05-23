package metaData_Search;
/**
 * 
 * @author Suvraneel
 *
 */
import java.io.Serializable;

@SuppressWarnings("serial")
public class Song implements Serializable{
	String title;
	String artist;
	
	// Parameterized Constructor
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	// Class Method getTitle it returns the title of the song
	public String getTitle() {
		return title;
	}
	
	// Class Method getArtist, it returns the Artist name of the song
	public String getArtist() {
		return artist;
	}
	
}