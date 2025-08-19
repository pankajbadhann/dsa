public class Binary_Search_Tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node build_BST(int value, Node root) {
        if (root == null)
            return new Node(value);
        if (root.data > value)
            root.left = build_BST(value, root.left);
        else
            root.right = build_BST(value, root.right);
        return root;
    }

    public static void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data);
        print(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key) {
            return true;
        }
        if (root.data > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static Node delete(Node root, int key) {

        if (root.data > key)
            root.left = delete(root.left, key);
        else if (root.data < key)
            root.right = delete(root.right, key);
        else{
//            case 1 - leaf node
            if(root.left == null && root.right == null)
                return null;
//            cae 2 - single child
            if(root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
//            case 3 - both children
            Node IOS = InoderSuccesor(root.right);
            root.data = IOS.data;
            root.right = delete(root.right, IOS.data);
        }
        return root;
    }
    public static Node InoderSuccesor(Node root){
        while(root.left!= null){
            root = root.left;
        }
        return root;
    }
    public static Node inorder(Node root){
        if (root == null)
            return null;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
        return root;
    }

}
