import java.util.*;
class Tcs_10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.print(check(s));
    }
    static boolean check(String s){
        Stack<Character>l=new Stack<>();
        char []c=s.toCharArray();
        for(char e:c){
            if(e=='[' || e=='{'||e=='(')
            l.add(e);
            else if(e==']' && !l.isEmpty() && l.peek()=='[')
            l.pop();
            else if(e=='}' && !l.isEmpty() && l.peek()=='}')
            l.pop();
            else if(e==')' && !l.isEmpty() && l.peek()==')')
            l.pop();
            else
            return false;
        }
        return l.isEmpty();

    }
}