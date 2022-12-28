import java.util.*;
class AliceAppletree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        if(m<=s*k){
            System.out.println("collected apples:"+m);
        }
        else if(m<=(s*k)+w+e){
            System.out.println("collected apples:"+s*k+(m-s*k)*k);
        }
        else{
            System.out.println("Not collected");
        }
    }
}