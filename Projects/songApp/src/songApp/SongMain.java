/**
 * 	T91/CSE/194032
 * 	@author Suvraneel Bhuin
 *	Class Roll No. - 19
 */
package songApp;
import java.io.File;
import java.util.Scanner;
 
public class SongMain {
 
    public static void main(String[] args) throws Exception {
 
        SongCollection songCollection = new SongCollection();
        Scanner scanner = new Scanner(System.in);
        // Main Menu
        while (true) {
            System.out.println("======= Select action =======\n" +
                    "0. Quit\n" +
                    "1. Get collection size\n" +
                    "2. Search for title\n" +
                    "3. Search for artist\n" +
                    "4. Add from file\n" +
                    "5. Save to file\n" +
                    "6. Add one song\n" +
                    "7. Remove song(s)\n" +
                    "8. Show\n" +
                    "======= Enter choice =======> ");
 
            int choice = Integer.valueOf(scanner.nextLine());
            if (choice == 0) {
            	System.out.println("Program Terminated...");
                break;
            }
            switch (choice) {
            
                case 1:	// size of play-list
                    System.out.println("Current Song Collection Size = " + songCollection.size());	// call size() method
                    break;
                    
                case 2:	// Search by Song Title
                    System.out.println("Enter title search keyword:");
                    String key = scanner.nextLine();					// read search keyword
                    songCollection.searchByTitle(key);					// call searchByTitle() by passing keyword
                    break;
                    
                case 3:	// Search by Artist
                    System.out.println("Enter artist search keyword: ");
                    String key2 = scanner.nextLine();					// read search keyword
                    songCollection.searchByArtist(key2);				// call searchByTitle() by passing keyword
                    break;
 
                case 4:	// Read from file & add to play-list
                    System.out.println("Enter file name: ");
                    String fname = scanner.nextLine();					// read input filename
                    songCollection.addFromFile(new File(fname));		// call addFromFile() by passing source filename 
                    break;
                    
                case 5:	//Write play-list to file
                    System.out.println("Enter file name: ");
                    String resFile = scanner.nextLine();				// read output filename
                    songCollection.writeToFile(new File(resFile));		// call writeToFile() by passing result filename 
                    break;
                    
                case 6:	// Add a song to play-list
                    System.out.println("Enter title of the song: ");
                    String title = scanner.nextLine();					// read title property of new song
                    System.out.println("Enter artist name: ");
                    String artist = scanner.nextLine();					// read artist name property of new song
                    songCollection.addOneSong(title, artist);			// call addOneSong() by passing new song's properties
                    break;
                    
                case 7:
                	// Delete-triggered Sub-Menu
                	int subChoice = DelSubMenu();						// call DelSubMenu() method
                	switch(subChoice) {
                	
                		case 0:	// Back to Main Menu
                			System.out.println("Returning to Main Menu...");
                			break;
                			
                		case 1:	// Delete a song by position
                			System.out.println("Enter position: ");
                        	int posn = Integer.valueOf(scanner.nextLine());		//read position to be deleted
                        	System.out.println("Song getting deleted:");
                        	songCollection.delete(posn);				//call delete() on user-input position
                        	break;
                        	
                		case 2:	//Delete a song by Title
                			System.out.println("Enter title search key:");
                        	String key3 = scanner.nextLine();			// read search keyword
                			int pos = songCollection.searchByTitle(key3);		//call searchByTitle() & store returned position
                			System.out.println("Song getting deleted:");
                			songCollection.delete(pos);					// call delete() on position returned by search method previously
                			break;
                			
                		case 3:	//Delete all songs by a Artist
                			System.out.println("Enter artist search key: ");
                        	String key4 = scanner.nextLine();			// read search keyword
                        	songCollection.deleteByArtist(key4);		// call deleteByArtist() method by passing keyword
                        	break;
                	}
                	break;
                	
                case 8:	// Display play-list
                    songCollection.show();								//call show() method
                    break;
                default:												//switch's default statement
            }
 
        }
        scanner.close();
    }
    
    // method to display "Delete Sub-Menu"
    public static int DelSubMenu() {
		int choice;
		System.out.println("\n====== Delete SubMenu ======\n" +
							"0. Back to Main Menu\n"+
							"1. Delete one song by Position\n" +
							"2. Delete a song by Title\n" + 
							"3. Delete all songs by Artist\n" +
							"======= Enter Choice ======> ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt(); 											// Reading the entered choice in Sub-Menu
		return choice;		
	}
}