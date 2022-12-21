import java.io.*;
import java.util.Scanner;
 
public class sequence2
{
	public static void main(String[] args) {
	    int num,i,j;
	    System.out.println("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for(i=1;i<=num;i++){
            for(j=1;j<=num;j++){
                if(j<=i){
                     System.out.print(num+j-i);
                }
                else{
                     System.out.print(num);
                }
            }
             System.out.println("");
        }
	}
}