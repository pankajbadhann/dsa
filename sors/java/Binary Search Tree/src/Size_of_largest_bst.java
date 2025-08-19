public class Size_of_largest_bst {
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
    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;

    public static Info largest_bst(Node root){
        if(root == null)
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Info left_info = largest_bst(root.left);
        Info right_info = largest_bst(root.right);
        int size = left_info.size + right_info.size + 1;
        int min = Math.min(root.data, Math.min(left_info.min, right_info.min));
        int max = Math.max(root.data, Math.max(left_info.max, right_info.max));

        if(root.data <= left_info.max || root.data>= right_info.min)
            return new Info(false, size, min, max);

        if(left_info.isBST && right_info.isBST){
            maxBST = Math.max(maxBST, size);
            new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
}
