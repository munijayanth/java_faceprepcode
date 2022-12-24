import java.util.Scanner;
public class Fibonacci_1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		a[0]=9;
		a[1]=11;
		
		for(int i=2;i<n;i++){
		    a[i]=a[i-1]+a[i-2];
		}
		for(int i:a){
		    System.out.print(" "+i);
		}
	}
}
