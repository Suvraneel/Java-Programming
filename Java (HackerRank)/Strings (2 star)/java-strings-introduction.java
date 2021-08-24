import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes":"No");
        System.out.printf("%S"+"%s"+" "+"%S"+"%s",A.charAt(0),A.substring(1,A.length()),B.charAt(0),B.substring(1,B.length()));
    }
}



