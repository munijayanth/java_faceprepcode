import java.util.*;
class Tcs_4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        check(a);
    }
    static void check(int a){
        int two=0,five=0;
        while(a!=1){
            if(a%2==0){
                two++;
                a=a/2;
            }
            else if(a%5==0){
                five++;
                a=a/5;
            }
            else
            break;
        }
        System.out.println("2's:"+two+" and 5's:"+five);
    } 
}