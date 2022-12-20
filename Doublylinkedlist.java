public class Doublylinkedlist {    
        
      
    class Node{    
        int data;    
        Node next;
        Node prev;
        
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;
            this.prev =null;
            
        }    
    }    
     
       
    public Node head = null;    
    public Node tail = null;    
        
        
    public void addNode(int data) {    
         
        Node newNode = new Node(data);    
            
           
        if(head == null) {    
                
            head = newNode;    
            tail = newNode;
            head.prev= null;
            tail.next= null;
        }    
        else {    
            newNode.prev = tail;
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
        
       
    public int countNodes() {    
        int count = 0;    
           
        Node current = head;    
            
        while(current != null) {    
              
            count++;    
            current = current.next;    
        }    
        return count;    
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
            
        CountNodes sList = new CountNodes();    
            
          
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
          
        sList.display();    
            
           
         
    }    
}    