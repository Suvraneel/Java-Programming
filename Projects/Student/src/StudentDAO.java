import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentDAO {
	private StudentDAO() {}
	private static Result[] results;
	private static StudentDAO[] numOfInst;
	private static int readInst, numOfEntries;
	// static block
	static {
		numOfInst = new StudentDAO[5];
		readInst = -1;
		File fpr = new File("ResultDB");						// reads file
		try {
			Scanner sc = new Scanner(fpr);
			numOfEntries = sc.nextInt();						// no. of entries in file
			results = new Result[numOfEntries];					// creates array of objects
			int rollNo, marks;
			for (int i=0; i< numOfEntries; i++) {				// input loop
				rollNo = sc.nextInt();
				marks = sc.nextInt();
				results[i] = new Result(rollNo, marks);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// getInstance() method
    public static StudentDAO getInstance()
    {
    	readInst+=1;
        if (readInst < 5) {
            numOfInst[readInst] = new StudentDAO();				// create object
        }
		return numOfInst[readInst%5];							// returns in Round-Robin fashion
    }
    
    // non-static getMarks() Method
    public int getMarks(int rollNo) {
    	for (int i=0; i < numOfEntries; i++) {					// linear search using roll no
    		if (results[i].rollNo == rollNo)
    			return results[i].marks;						// returns marks for that roll no. 
    	}
		return -1;												// roll no. not found
    }

}
