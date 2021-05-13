/**
 * 	T91/CSE/194032
 * 	@author Suvraneel Bhuin
 *	Class Roll No. - 19
 */
package songApp;
public class Song {
    private String title;
    private String artist;
 
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
 
    public String getTitle() {
        return title;
    }
 
    public String getArtist() {
        return artist;
    }
}