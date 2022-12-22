/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class stringconv
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		    
		    String s1=sc.nextLine();
		    String s2=sc.nextLine();
		    String s3=sc.nextLine();
		    char[] ch1=s1.toCharArray();
		    char[] ch2=s2.toCharArray();
		    char[] ch3=s3.toCharArray();
		    
		    for(int i=0;i<ch1.length;i++)
		    {
		        if(ch1[i]!='a'&& ch1[i]!='e' && ch1[i]!='o' && ch1[i]!='i' && ch1[i]!='u')
		        {
		            ch1[i]='#';
		        }
		    }
		    System.out.println("st1:");
		    for(char c:ch1){
		        System.out.print(c);
		    }
		    
		    for(int i=0;i<ch2.length;i++)
		    {
		        if(ch2[i]=='a'|| ch2[i]=='e' || ch2[i]=='o' || ch2[i]=='i' || ch2[i]=='u')
		        {
		            ch2[i]='$';
		        }
		    }
		    System.out.println();
		    System.out.println("st2:");
		    for(char c:ch2){
		        System.out.print(c);
		    }
		    
		    System.out.println();
		    System.out.println("st3:");
		    for(int i=0;i<ch3.length;i++){
		        if(ch3[i]>=97){
		        ch3[i]=(char)(ch3[i]-32);}
		    }
		     for(char c:ch3){
		        System.out.print(c);
		    }
		}
}
