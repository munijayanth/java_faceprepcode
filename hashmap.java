import java.util.*;

public class hashmap
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char []c=s.toCharArray();
	    HashMap<Character,Character> map=new HashMap<Character,Character>();
           map.put('0','0');
           map.put('1','1');    
           map.put('8','8');   
           map.put('6','9');
           map.put('9','6');
           int i=0;
           int j=c.length-1;
        while (i <= j) {
            if(!map.containsKey(c[i])) {
                    System.out.println("false");
                    break;
                }
            if(c[i] != map.get(c[j])){
                System.out.println("false");
            }
            else{
            System.out.println( "True");}
            i++;
            j--;
            
            
 }
} 
    