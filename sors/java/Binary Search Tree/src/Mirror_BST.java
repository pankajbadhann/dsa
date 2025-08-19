public class Mirror_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node mirror_bst(Node root){
        if(root == null)
            return null;
        Node left_mirror = mirror_bst(root.left);
        Node right_mirror = mirror_bst(root.right);
        root.left = right_mirror;
        root.right = left_mirror;
        return root;
    }
    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        inorder(root);
        System.out.println();
        root = mirror_bst(root);
        inorder(root);
    }
}
