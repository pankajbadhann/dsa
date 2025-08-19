public class Subtree_of_another_tree extends Build_Tree {
    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null)
            return false;

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot))
                return true;
        }
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return left || right;
    }
    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null)
            return true;
        else if(root == null || subRoot == null || root.data != subRoot.data)
            return false;
        if (!isIdentical(root.left, subRoot.left))
            return false;
        if (!isIdentical(root.right, subRoot.right))
            return false;

        return true;
    }

    public static void main(String[] args) {
        Build_Tree.Node root = new Build_Tree.Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Build_Tree.Node node = new Build_Tree.Node(2);
        node.left = new Node(4);
        node.right = new Node(5);
        System.out.println(isSubtree(root, node));
    }
}
