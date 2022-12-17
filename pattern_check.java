import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class pattern_check {
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        String patt= sc.nextLine();
        Pattern pattern = Pattern.compile(patt);
 
        Matcher matcher = pattern.matcher(input);
         
        boolean matchFound = matcher.matches();
        if(matchFound==true){
             System.out.println("Matched");
        }
        else{
             System.out.println("Not Matched");
        }
       
        
         
    }
 
}