public class recusion{
    static int sum(int a){
        if(a==1){
            return 1;
        }
        return a+sum(a-1);
    }
    public static void main(String args[]) {
    
      System.out.println("Sum of 3 numbers is:" + sum(3));
    }
}