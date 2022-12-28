import java.util.*;
class ActivitiesDone{
    public static void main(String args[]){
        //sorted 
        int []start={1,2,3,9};
        int []end={3,4,2,7};
    
        int b=end[0];
        
            for(int i=0; i < end.length; i++){  
                for(int j=1; j < (end.length-i); j++){  
                         if(end[j-1] > end[j]){   
                               int temp = end[j-1];  
                                end[j-1] = end[j];  
                                end[j] = temp;
                                
                                int temp2=start[j-1];
                                start[j-1]=start[j];
                                start[j]=temp2;
                        }  
                         
                }  
        }

        int k=0;
        System.out.println("The activities that can be sheduled are:");
        System.out.println(0);
        for(int i=1;i<start.length;i++){
            if(start[i]>=end[k]){
                System.out.println(i);
                k=i;
            }
        }
    }
}