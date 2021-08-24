import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    if (a.length()!= b.length())
    return false;
        int count = 0;
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        for (char c= 'a'; c <='z'; c++){
            for (int i = 0; i < A.length(); i++){
                if (A.charAt(i)==c)
                count++;
                if (B.charAt(i)==c)
                count--;
            }
        if (count!= 0)
        return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}