
import java.io.*;
import java.util.Scanner;
public class prime{
public static void main(String[] args) {
		int num,ct=0,n=0,i=1,j=1; 
		
        System.out.println("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
	
		while(n<num){  
			j=1;  
			ct=0;  
			while(j<=i){  
				if(i%j==0)  
				ct++;  
				j++;   
			}  
		if(ct==2)  
			{  
			if(n==(num-1)){
			System.out.printf("%d",i); } 
			n++;  
			}  
		i++;  
			
		}
	}
}