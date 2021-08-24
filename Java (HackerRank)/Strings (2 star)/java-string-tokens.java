import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() != 0){
        String[] str = s.split("[, ?.'@!_]+");
        System.out.println(str.length);
        for (String a : str)
        System.out.println(a);
        }else{System.out.println(0);}
    }
}