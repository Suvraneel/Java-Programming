import java.util.Scanner;

public class ResultQuery {

	// main driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'Y';
		do {
			StudentDAO std = StudentDAO.getInstance();
			System.out.println("Instance ID returned:\t"+std);
			System.out.println("Enter roll No of the student : ");
			int rollNo = sc.nextInt();
			System.out.println("Roll No. entered:\t"+rollNo);
			int marks = std.getMarks(rollNo);
			if (marks == -1)
				System.out.println("No such student exists with Roll No. "+rollNo);
			else
				System.out.println("Marks obtained:\t"+marks);
			System.out.println("Do you want to continue (Y/N) ?");
			ch = sc.next().charAt(0);
		} while (ch == 'Y'|| ch == 'y');								//run loop while user enters 'Y'
		sc.close();
	}

}
