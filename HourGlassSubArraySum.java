import java.util.*;
class HourGlassSubArraySum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(row>=3 && col>=3){
        int [][]a=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int mark1=0;
        int mark2=0;
        for(int i=0;i<row-2;i++){
            for(int j=0;j<col-2;j++){
                int sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(sum>max){
                    max=sum;
                    mark1=i;
                    mark2=j;
                }
            }
        }
        System.out.println("The max sum Hourglass combination in the given array is:");
        System.out.println(a[mark1][mark2]+" "+a[mark1][mark2+1]+" "+a[mark1][mark2+2]+" "+a[mark1+1][mark2+1]+" "+a[mark1+2][mark2]+" "+a[mark1+2][mark2+1]+" "+a[mark1+2][mark2+2]);
        System.out.println("The sum is: "+max);    
    }
    else{
        System.out.print("The hourglass combination does not exist,Try giving 3X3 or more");
    }
        
        
    }
}