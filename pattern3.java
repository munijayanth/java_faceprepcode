import java.util.*;

public class pattern3 {

public static void main(String[] args) {

int count1=0,count2=0;
int N=4;
for(int i=N;i>=1;i–) {
	for(int j=N;j>i;j–) 
		System.out.print(” “);

	for(int k=1;k<=i;k++) 
		System.out.print(++count1+“*”);

		for(int l=1;l<=i;l++) {
			System.out.print(++count2+i*i);
				if(l!=i) 
					System.out.print(“*”);
				}
				System.out.println();
				}
				}

}