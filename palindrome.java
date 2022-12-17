import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal:");
        int decimal=sc.nextInt();
        int binary[] = new int[40];    
		int index = 0; 
        		
		while(decimal > 0){    
		   binary[index++] = decimal%2;    
		   decimal = decimal/2;    
		 }    
		for(int i = index-1;i >= 0;i--){    
		   System.out.print(binary[i]);    
		 }    
        System.out.println();
	    int i=0,count=0;
		int j=binary.length-1;
		while(i<binary.length ||j>=0){
		   if(a[i]==a[j])
		        count++;
		        i++;
		        j--;
		    }
		if(count==index){
			System.out.print("It is palindrome");
		}
			
		
}    


    }
