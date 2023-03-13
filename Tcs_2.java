import java.util.*;
class Tcs_2{
public static void main(String args[]){
    int []a={0,1,0,1,0};
    check(a);
    for(int i:a)
    System.out.println(i);
}
static void check(int []a){
    int i=0,j=a.length-1,n=0;
    while(i<=j){
        if(a[i]==0)
        i++;
        if(a[j]==1)
        j--;
        if(a[i]==1 && a[j]==0)
        n=a[i];
        a[i]=a[j];
        a[j]=n;
        i++;
        j--;
    }
    
}
}