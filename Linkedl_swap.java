import java.util.*;
class Linkedl_swap{
    class Node{
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
        Node current=new Node(data);
        if(head==null){
            head=current;
            tail=current;
        }
        else{
            tail.next=current;
            tail=current;
        }
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public void change(){

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Linkedl_swap l=new Linkedl_swap();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        l.display();
    }
}