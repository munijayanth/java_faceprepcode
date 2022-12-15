import java.util.Scanner;
public class arrayproduct {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int b=1;
        for(int i=0;i<n;i++){
            b=b*a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=b/a[i];
            System.out.print(" "a[i]" ");
        }
        
        
    }
}