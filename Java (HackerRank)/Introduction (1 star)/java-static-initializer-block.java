import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    static int B, H;
    static boolean flag = false;
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        scan.nextLine();
        H = scan.nextInt();
        scan.close();
        if ( B <= 0 || H <= 0){
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else {
        int area = B * H ;
        flag = true ;
         }
    }




public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

