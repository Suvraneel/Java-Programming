import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean bool = true;
        for (int i=0; i < A.length()-1 ; i++)
        {
        if (A.charAt(i)!=A.charAt(A.length()-i-1))
            bool = false;
        }

        System.out.println(bool == true? "Yes":"No");
    }
}