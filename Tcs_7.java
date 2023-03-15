import java.util.*;
//did u buy the chocolate worth 3$ or 7$ out of 100$?
class Tcs_7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
    }
    static void check(int n){
        boolean []a=new boolean[100];
        for(int i=99;i>0;i--){
            if(100-i%3==0 || 100-i%7==0){
                a[i]=true;
            }
            else if(combi(100-i))
            a[i]=true;
            if(a[i])
            System.out.print(100-i+" "); 
        }
        if(a[n]){
            combiprint(100-n);
        }
        else{
            System.out.println();
        System.out.println("Not possible");
        }
        
    }
    static boolean combi(int a){
        while(a>7){
            a=a-7;
        }
        if(a%3==0)
        {
        while(a>0){
            a=a-3;
            }
        if(a==0)
        return true;
    }
    else
    return false;
    return true;
    }
    static void combiprint(int a){
        int three=0,seven=0;
        while(a>7){
            a=a-7;
            seven++;
        }
        if(a%3==0)
        {
        while(a>0){
            a=a-3;
            three++;
        }
    }
    System.out.println();
    System.out.println("no of 3$ chocolates:"+three+" and no of 7$ chocolates:"+seven);
}
}