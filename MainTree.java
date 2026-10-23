class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
}

public class MainTree {
    public static void main(String[] args) {
        Node root=insert(50, null);
        insert(30,root);
        insert(60, root);
        insert(40, root);
        insert(70, root);
        insert(80, root);
        System.out.println("Pre-Order");
        preorder(root);
        System.out.println("\nIn-Order");
        inorder(root);
        System.out.println("\nPostOrder");
        postOrder(root);
        System.out.println("\nLeaf Nodes "+leafCount(root));
        System.out.println("Height of the tree = "+height(root));
        System.out.println(search(300, root));
        


    }
    static Node insert(int data,Node root){
        if(root==null) {
            root=new Node(data);
            return root;
        }
        if(data<root.data)root.left=insert(data, root.left);
        else root.right=insert(data, root.right);
        return root;
    }
    static void preorder(Node root){
        if(root==null ) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postOrder(Node root){
        if(root== null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int leafCount(Node root){
        if(root==null) return 0;
        if((root.left==null&&root.right==null)) return 1;
        int l=leafCount(root.left);
        int r=leafCount(root.right);
        return l+r;
    }
    static int height(Node root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return  Math.max(l, r)+1;
        
    }
    static boolean search(int key,Node root){
        if(root==null) return false;
        if(root.data==key) return true;
        else if(key<root.data) return search(key,root.left);
        else return search(key, root.right);
    }
}
