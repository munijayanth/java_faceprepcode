import java.util.*;
class Nibbleswap{
    public static void main(String args[]){
        /*this gives error if the given number exceeds 8bit value */
        int a=123;
        int b1=0x0f;
        int b2=0xf0;
        int c=a&b1;
        c<<=4;
        int d=a&b2;
        d>>=4;
        int f=c|d;
        System.out.print(f);
    }
}