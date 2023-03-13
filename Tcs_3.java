import java.util.*;
class Tcs_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        check(a);
    }
    static void check(int a){
        int sum=0;
        for(int i=2;i<=a;i++){
            if(checkprime(i))
            {
                if(a%i==0){
                    sum+=i;
                    a=a/i;
                }
            }
        }
        System.out.println("Sum of prime factors is:"+sum);
    }
    public static boolean checkprime(int n){
        int count=0;
        if(n==2)
        return true;
        else{
            for(int i=2; i<n; i++)
            {
            if(n%i == 0)
            {
                count++;
                break;
            }
            }
        }
        if(count==0)
            return true;
        else
            return false;
        
    }
}
