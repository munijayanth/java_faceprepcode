import java.util.*;
class Sequence_4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Range till the series is required:");
        int n=sc.nextInt();
        int a=30;
        int b=35;
        int c=8;
        int d=6;
        int i=1;
        int count=0;
        System.out.println("The series upto "+n+" places is:");
        System.out.print(a+" "+b+" ");
        while(true){
            if(i%2==0){
                System.out.print(a+c+" ");
                c=c+8;
            }
            else{
                System.out.print(b+d+" ");
                d=d+6;           
            }
            i++;
            count++;
            if(count==n-2)
            break;

        }
    }
}