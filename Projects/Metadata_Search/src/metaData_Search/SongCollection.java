/**
 * 	T91/CSE/194032
 * 	@author Suvraneel Bhuin
 *	Class Roll No. - 19
 */
package metaData_Search;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SongCollection {
 
    private Song[] theSongs;
    private Song[] updatedList;
    
    public SongCollection() {
        this.theSongs = new Song[0];								// initiate play-list with 0 songs
    }

    // method to return number of songs in current play-list
    public int size() {
        return theSongs.length;
    }
 
    // method to read data from file passed as argument
    public void addFromFile(String fname) throws Exception{
    	
		FileInputStream f = new FileInputStream(fname);
		ObjectInputStream o1 = new ObjectInputStream(f);
		int initLength = (int)o1.readInt();
    	int newLength = size() + initLength;						// length of updated play-list
    	updatedList = new Song[newLength];
        for (int i=0; i < size(); i++) {
			updatedList[i] = theSongs[i];							// copy songs from play-list to updated list
		}       
        for (int i = size(); i < newLength; i++) {
			updatedList[i] = (Song)o1.readObject();					// read & add songs from file to updated list 
		}
        this.theSongs = updatedList;								// make old play-list point to the updated one
		o1.close();
		f.close();
        System.out.println("File Collection successfully loaded.");
	}
	
    // method to write play-list data to file passed as argument
	public void writeToFile(String fname) throws Exception{
		
		FileOutputStream f = new FileOutputStream(fname);
		ObjectOutputStream o1 = new ObjectOutputStream(f);
		
		o1.writeInt(theSongs.length);
		for(int i=0; i< size(); i++) {
			o1.writeObject(theSongs[i]);							//writes all songs in play-list to the file
		}
		o1.close();
		f.close();
        System.out.println("File synced successfully.");
	}
 
    // method for adding a user-input song to play-list
    public void addOneSong(String t, String a) {
        int newLength = this.theSongs.length + 1;					// increment in play-list length by 1
        Song[] updatedList = Arrays.copyOf(theSongs, newLength);	// copy old play-list to new one
        updatedList[this.theSongs.length] = new Song(t, a);			// add user-input song at the end of play-list
        this.theSongs = updatedList;								// make old play-list point to the updated one
    }
 
    // method to delete a song from play-list by position
    public void delete(int pos) {									// `pos` denotes the position of song to be deleted
        Song[] finalList = new Song[size() - 1];					// decrement in play-list length by 1
        System.out.println(theSongs[pos].getTitle() + "\n\t\t - " + theSongs[pos].getArtist());
        for (int i = 0; i < pos; i++) {
            finalList[i] = theSongs[i];								// copy the songs before `pos` as it is
        }
        for (int i = pos; i < size() - 1; i++)						// copy the songs after `pos` left-shifting 1 position
            finalList[i] = theSongs[i + 1];
        theSongs = finalList;										// make old play-list point to the updated one
    }
    
    // method to delete all songs by a certain artist
    public void deleteByArtist(String keywd) {
    	System.out.println("Songs getting deleted:");
    	for (int i = 0; i < size(); ) {
            if (theSongs[i].getArtist().contentEquals(keywd)) {		// compare `keywd` with artist property of each song
            	delete(i);											// calls delete() method every time artist matches `keywd`
            }
            else i++;												// check next song if not matched
        }
    }
    
    // method to search play-list for a song by its title-name
    public int searchByTitle(String keywd) {
    	int i;
        for (i = 0; i < size(); i++) {
            if (theSongs[i].getTitle().contentEquals(keywd)) {		// compare `keywd` with title property of each song
                System.out.println(i + ". " + theSongs[i].getTitle()+ "\n\t\t - " + theSongs[i].getArtist());
                break;
            }
    	}
        return i;													// return position of matched song
    }
 
    // method to search play-list for a song by a certain artist
    public void searchByArtist(String keywd) {
    	System.out.println("Songs by the artist: " + keywd + "=>");
        for (int i = 0; i < size(); i++)
            if (theSongs[i].getArtist().contentEquals(keywd))		// compare `keywd` with artist property of each song
                System.out.println(i + ". " + theSongs[i].getTitle());
    }
 
    // method to display current play-list
    public void show() {
        System.out.println("~~~~~~ Song Collection ~~~~~~\n");
        for (int i = 0; i < size(); i++)
            System.out.println(i + ". " + theSongs[i].getTitle() + "\n\t\t - " + theSongs[i].getArtist());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}