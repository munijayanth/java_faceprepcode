import java.util.*;
class Tcs_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        check(a,b);
    }
    static void check(String a,String b){
        if(a.length()!=b.length())
        System.out.println("Not an Anagram");
        else{
        char[]a1=a.toCharArray();
        char[]b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        int count=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]==b1[i])
            count++;
        }
        if(count==a1.length)
        System.out.println("They are anagrams");

    }
}
}