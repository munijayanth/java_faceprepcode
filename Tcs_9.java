import java.util.*;
//Unique number or not?
class Tcs_9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=l;i<=n;i++){
            if(check(i)){
            count++;
          // System.out.println(i);
        }
        }
        if(count>0)
        System.out.println(count);
        else
        System.out.println("No unique number");
    }
    static boolean check(int v){
        int d=0;
        String s=String.valueOf(v);
        char []a=s.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1])
            d++;
        }
        if(d>0)
        return false;
        else return true;
    }
}