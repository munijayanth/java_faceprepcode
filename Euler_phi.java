import java.util.*;
class Euler_phi{
    /*static intgcd(a,b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    } */
    static int Gcd (int a,int b){
        int c=1;
        if(a<b){
        for(int i=1;i<=a;i++){
            if(a%i==0){
                if(b%i==0){
                    if(c<=i){
                        c=i;
                    }
                }
            }
        }
    }
    return c;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<n;i++){
        
        if(Gcd(i,n)==1){
            System.out.println(i);
            count++;
        }
    }
    System.out.println("Total number of coprimes possible in pair(i,"+n+") is:"+count);

}
}