
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class subtree_inrange
{
    
    public static Node insert(Node root, int key)
    {
       
        if (root == null) {
            return new Node(key);
        }
 

        if (key < root.data) {
            root.left = insert(root.left, key);
        }
        
        else {
            root.right = insert(root.right, key);
        }
 
       
        return root;
    }
 

    public static boolean findSubTrees(Node root, int low, int high, AtomicInteger count)
    {
       
        if (root == null) {
            return true;
        }
 
        boolean left = findSubTrees(root.left, low, high, count);
        boolean right = findSubTrees(root.right, low, high, count);
        if (left && right && (root.data >= low && root.data <= high))
        {
           count.incrementAndGet();
            return true;
        }
 
        return false;
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
       
        int[] keys = new int[6];
        for(int i=0;i<6;i++){
            keys[i]=sc.nextInt();
        }
        
        int []range=new int[2];
        for(int i=0;i<2;i++){
            range[i]=sc.nextInt();
        }
        int low = range[0];
        int high = range[1];
 
        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
 
      
       AtomicInteger count = new AtomicInteger(0);
 
        
        findSubTrees(root, low, high, count);
        System.out.println("The total number of subtrees is " + count);
    }
}
class Node
{
    int data;
    Node left;
    Node right;
 
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}