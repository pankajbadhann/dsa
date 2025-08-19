import java.util.ArrayList;

public class Bst_to_Balanced_bst {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    public static Node create(Node root){
        ArrayList<Integer>ans = new ArrayList<>();
        inorder(root, ans);
        return helper(ans, ans.get(0), ans.get(ans.size()-1));
    }
    public static Node helper( ArrayList<Integer>ans, int s, int e){
        if(s>e){
            return null;
        }
        int mid = (e+s)/2;
        Node root = new Node(mid);
        root.left = helper(ans, s, mid-1);
        root.right = helper(ans, mid+1, e);
        return root;
    }
    public static void preorder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root = create(root);
        preorder(root);
    }
}
