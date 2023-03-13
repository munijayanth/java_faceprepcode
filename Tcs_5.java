import java.util.*;
class Tcs_5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        check(s);
    }
    static void check(String s){
        String s1="";
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                s1=s1+s.charAt(i);
            }
        }
        if(!s1.contains('9')){
                int a=Integer.parseInt(s1);
                max=Math.max(max,a);
            }
        }
        System.out.println(s1);
    }
