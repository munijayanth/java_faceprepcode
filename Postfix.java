import java.util.*;
class Postfix{
    public static void main(String[] args) {
        String str="102*5+";
        Stack1 sc=new Stack1(str.length());
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=48 && ch<=57) {  
                    sc.push(ch-48);
            }
            else{
                int p1=sc.pop();
                int p2=sc.pop();
                switch(ch){
                    case '+':sc.push(p1+p2);break;
                    case '-':sc.push(p1-p2);break;
                    case '*':sc.push(p1*p2);break;
                    case '/':sc.push((int)(p1/p2));
							 break;
                   
                }
                
            }
        }
        System.out.println("Result:"+sc.pop());
    }
}

class  Stack1{
	
    int top=-1;
    int[]array;
    public Stack1(int n){
        array=new int[n];
    }
    
    public void push(int p){
        top++;
        array[top]=p;
    }
    public int pop() {
        return array[top--];
        
    }
}
