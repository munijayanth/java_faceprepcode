import java.util.*;
public class Join_sort
{
    public static class NodeA         
    {
        int data;       
        NodeA next;      
        
    }
    public static class NodeB         
    {
        int data;
        NodeB next;
    }
    public static class NodeC
    {
        int data;
        NodeC next;
    }
    public static void main(String args[])
    {
        NodeA newnodeA1=new NodeA();    
        NodeA newnodeA2=new NodeA();    
        NodeA newnodeA3=new NodeA();    
        NodeA newnodeA4=new NodeA();    
        newnodeA1.data=1;
        newnodeA2.data=3;
        newnodeA3.data=5;
        newnodeA4.data=7;

        newnodeA1.next=newnodeA2;       
        newnodeA2.next=newnodeA3;
        newnodeA3.next=newnodeA4;
        newnodeA4.next=null;
        
        NodeB newnodeB1=new NodeB();    
        NodeB newnodeB2=new NodeB();    
        NodeB newnodeB3=new NodeB();    
        NodeB newnodeB4=new NodeB();    
        newnodeB1.data=2;
        newnodeB2.data=4;
        newnodeB3.data=6;
        newnodeB4.data=8;

        newnodeB1.next=newnodeB2;       
        newnodeB2.next=newnodeB3;
        newnodeB3.next=newnodeB4;
        newnodeB4.next=null;
        
        NodeC newnodeC1=new NodeC();    
        NodeC newnodeC2=new NodeC();    
        NodeC newnodeC3=new NodeC();    
        NodeC newnodeC4=new NodeC();    
        NodeC newnodeC5=new NodeC();
        NodeC newnodeC6=new NodeC();
        NodeC newnodeC7=new NodeC();
        NodeC newnodeC8=new NodeC();
        
        newnodeC1.next=newnodeC2;
        newnodeC2.next=newnodeC3;
        newnodeC3.next=newnodeC4;
        newnodeC4.next=newnodeC5;
        newnodeC5.next=newnodeC6;
        newnodeC6.next=newnodeC7;
        newnodeC7.next=newnodeC8;
        newnodeC8.next=null;
        
        
        NodeA currentnode1=newnodeA1;        
        NodeB currentnode2=newnodeB1;
        NodeC currentnode3=newnodeC1;
        while(currentnode3.next!=null)      
        {
            if(currentnode1.data>currentnode2.data)     
            {
                currentnode3.data=currentnode2.data;
                currentnode2=currentnode2.next;
                currentnode3=currentnode3.next;
                
            }
            else if(currentnode1.data<currentnode2.data)
            {
                currentnode3.data=currentnode1.data;
                currentnode1=currentnode1.next;
                currentnode3=currentnode3.next;
            }
            
        }
        
        NodeC currentnode=newnodeC1;   
        System.out.println("The merged list is:");
        for (int i=1;i<=8;i++)
        {
            System.out.print(currentnode.data+" ");
            currentnode=currentnode.next;
        }
        
        
    }
}