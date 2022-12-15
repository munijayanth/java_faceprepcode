
import java.util.*;

public class anagram
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string 1:");
        String s = scan.nextLine();
         System.out.print("Enter the string 2:");
        String t = scan.nextLine();

        if(s.length() != t.length()) {
            System.out.println("NO");
            
        }

        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(s_array);
        Arrays.sort(t_array);

        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s_array[i] == t_array[i]) {
                count++;
            }
        }

        if(count == s.length()) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        
}
		
	}
