import java.util.Scanner;
public class Patternsequencecheck
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Rows:");
	    int row=sc.nextInt();
	    System.out.print("Columns:");
	    int col=sc.nextInt();
	    System.out.print("To Check:");
	    int check=sc.nextInt();
	    int n,i=0;
	    if(check<row){
	            System.out.println("Yes");
	            i++;
	        }
	   for(n=1;n<=col;n++){
	       int p=n*row;
	       if(p+1<row*col){
	       if(check==p || check== p+1){
	           System.out.println("Yes");
	           i++;
	       }
	       }
	   }
	   if(i==0){
	       System.out.println("No");
	   }
	   
	   
	    
	}
}
