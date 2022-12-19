import java.util.*;
class LargestSquareArea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int area=(a*(int)(Math.sqrt(b)));
        /*for(int i=1;i<b;i++){
            if(b==i*i){
                System.out.println(i*i*a*a);
                break;
            }
            if(b<i*i){
                area=a*a*(i-1)*(i-1);
                break;
            }
        }
        System.out.println(area);
        */

        System.out.println(area*area);
    }
}