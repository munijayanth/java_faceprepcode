import java.util.Scanner;
public class sequence_generator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
	
		
		int a= sc.nextInt();
		if(a%2==0){
		    
		    System.out.println((int)Math.pow(3,(a/2-1)));
		}
		else{
		    
		    System.out.println((int)Math.pow(2,a/2));
		}
		c++;
    }
}

