import java.util.Scanner;
public class Sequence3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=4;
		int n=sc.nextInt();
		System.out.print(a);
		for(int i=1;i<n;i++){
		    a=a+(i*i);
		    System.out.print(" "+a);
		}
	}
}
