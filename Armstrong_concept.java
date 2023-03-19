import java.util.*;
class Armstrong_concept{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double range=Math.pow(10,n-1);
        double range1=Math.pow(10,n)-1;
        for(double i=range;i<range1;i++){
            check(i,n);
        }
    }
    static void check(double a,int n){
        double k=a;
        double sum=0;
        int count=n;
        
        while(a!=0){
            int t=(int)a%10;
            sum=sum+Math.pow(t,count);
            a=a/10;
        }
        if(sum==k)
        System.out.println(k+" follows Armstrong concept.");
        
    }
}