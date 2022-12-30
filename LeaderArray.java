import java.util.*;
class LeaderArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int prev=a[n-1];
        System.out.print(prev+" ");
        for(int i=n-2;i>0;i--){
            if(a[i]>prev){
                prev=a[i];
                System.out.print(prev+" ");
            }
        }
    }
}