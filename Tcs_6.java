import java.util.*;
//largest power of prime in a factorial series
class Tcs_6{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t>100 || t<0)
        System.exit(0);
        while(t>0){
            int n=2;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            check(a);
            t--;
        }
    }
    static void check(int[]a){
        int sum=0;
        while(a[0]!=0){
            a[0]=a[0]/a[1];
            sum+=a[0];
        }
        System.out.println(sum);
    }
}