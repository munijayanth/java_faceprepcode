import java.util.*;

class Stack {
    int top = -1;
    int MAX = 10;
    int[] arr = new int[MAX];
    Scanner scan = new Scanner(System.in);  
    int[]b=new int[MAX];
    public void push() {
        if (top == MAX) {
            System.out.println("Stack Overflow");
        }

        else {
            top++;
            System.out.println("Enter Value");  
            int val = scan.nextInt();
            arr[top]=val;
              
        }
    }

    public void pop() {
        
         if (top == -1)  
        {  
            System.out.println("Underflow !!");   
        }  
        else
        
        for(int i=0;i<arr.length;i++){
            if(i==top){
                continue;
            }
            b[i]=arr[i];
        }
        top--;
    }

    public boolean isEmpty() {
        return (top<0);
    }

    public int size() {
        if(top == -1) {
            System.out.println("there is no elements in stack");
        }
        int ans = arr.length;
        return ans;
    }

    public int topElement() {
        if(top == -1) {
            System.out.println("there is no elements in stack");
        }
        return arr[top];
    }
    
    public void display() {
        for(int i = 0; i<arr.length; i++) {
            System.out.println(b[i]);
        }
    }

}

class stackarray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  

        

        Stack st = new Stack(); 
        int loop=1;
        while(loop!=0){
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. isEmpty");
        System.out.println("4. size");
        System.out.println("5. topElement");
        System.out.println("6. display");
        System.out.println("0. End");
        System.out.print("your choice:");
        int caseNum = scan.nextInt();
        switch(caseNum) {
            case 1: st.push(); break;
            case 2: st.pop(); break;
            case 3:  System.out.println(st.isEmpty()); break;
            case 4:  System.out.println(st.size()); break;
            case 5:  System.out.println(st.topElement()); break;
            case 6: st.display(); break;
            case 0: loop=0;break;
            default: System.out.println("Please enter a valid Input"); break;

        }
        }

    }
}