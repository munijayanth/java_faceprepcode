 
 class oddeven_dlinked{
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    Node head, tail = null;  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
		
        if(head == null) {               
            head = tail = newNode;    
            head.previous = null;           
            tail.next = null;  
        }  
        else {         
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
  
    public void sort(){
		Node current = head;
		while(current!=null) {  
             if(current.data%2!=0){
				 
				 
			 }
             
            current = current.next;  
        }  
		
	}
    public void display() {  
         
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
              
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        DoublyLinkedList dList = new DoublyLinkedList();  
        
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        dList.sort();
        dList.display();  
    }  
} 






public class Main
{
	public static void main(String[] args) {
		int[]a={1,2,5,7,2,3,6};
		for(int i=0;i<a.length;i++){
		    if(a[i]%2!=0){
		        for(int j=i+1;j<a.length;j++){
		            if(a[j]%2==0){
		                int k=a[i];
		                a[i]=a[j];
		                a[j]=k;
		                break;
		            }
		        }
		       
		    }
		}
		for(int p:a){
		    System.out.println(p);
		}
	}
}
