import java.util.regex.* ;
import java.util.Scanner ;

public class myClass{
    public static void main (String[] args){
    Scanner s = new Scanner (System.in);
    int tokens = Integer.parseInt(s.nextLine());
    while (tokens > 0)
        {
        String pattern = s.nextLine();
    
    try {
    Pattern.compile(pattern);
    System.out.println("Valid");
    } catch (PatternSyntaxException e){System.out.println("Invalid");}
        tokens--;
        }
    }
}
