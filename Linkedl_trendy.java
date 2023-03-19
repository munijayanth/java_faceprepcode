import java.util.*;
public class Linkedl_trendy{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;

public void add(int data){
    Node newNode = new Node(data);    
    if(head == null) {    
        head = newNode;    
        tail = newNode;    
    }    
    else {        
        tail.next = newNode;    
        tail = newNode;    
    }   
} 
public void display() {       
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of linked list: ");    
        while(current != null) {       
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
    public void check(int n){
        Node current=head;
        int count=1;
        if(n%2!=0){
        while(current!=null){
            if((n/2)+1==count){
                if(current.data%3==0)
                System.out.println("Yes");
                else
                System.out.println("No");
                break;
            }
            count++;
            current=current.next;
        }
    }
        else{
             while(current!=null){
                if(n/2==count){
                if((current.data+current.next.data)%3==0)
                System.out.println("Yes");
                else
                System.out.println("No");
                break;
                }
                count++;
                current=current.next;
            }

        }
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Linkedl_trendy l=new Linkedl_trendy();
    int n=sc.nextInt();
    int p=n,count=0;
    while(p>0){
        int t=p%10;
        l.add(t);
        p=p/10;
        count++;
    }
    l.display();
    l.check(count);
} 
}