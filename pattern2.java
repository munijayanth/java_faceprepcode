import java.util.Scanner;
public class pattern2
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Number:");
	    int n=sc.nextInt();
	    System.out.println("pattern:");
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            if(j%2!=0){
        	         System.out.print("1");
        	         }
	            else
	                System.out.print("0");
	        }
	         System.out.println("");
	    }
	}
}
