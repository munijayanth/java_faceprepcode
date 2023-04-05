import java.util.*;
class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BuildTree{
        static int t=-1;
        static Node build(int nodes[]){
            t++;
            if(nodes[t]==-1){
                return null;
            }

            Node newNode=new Node(nodes[t]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            
            return newNode; 
        }
    }
    public static void preorder(Node root){
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static  void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null)
        return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue <Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }

        }
    }
    public static int count(Node root){
        if(root==null)
        return 0;
        int left=count(root.left);
        int right=count(root.right);

        return left+right+1;
    }
    public static int Sum_of_nodes(Node root){
        if(root==null)
        return 0;
        int left=Sum_of_nodes(root.left);
        int right=Sum_of_nodes(root.right);

        return left+right+root.data;
    }
    public static int height(Node root){
        if(root==null)
        return 0;

        int left=height(root.left);
        int right=height(root.right);
        int res=Math.max(left,right);
        return res+1;
    }
    public static void main(String args[]){
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree bt=new BuildTree();
        Node root=bt.build(nodes);
        /*System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        
        levelorder(root);
        */
        System.out.println("Number of nodes present is:"+count(root));
        System.out.println("Sum of the data present in nodes present is:"+ Sum_of_nodes(root));
        System.out.println("Height of tree is:"+height(root));
    }
}


