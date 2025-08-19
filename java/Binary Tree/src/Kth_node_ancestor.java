public class Kth_node_ancestor {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int kth_ancestor(Node root, int k, int n){
        if(root == null)
            return -1;
        if(root.data == n)
            return 0;
        int left_distance = kth_ancestor(root.left, k, n);
        int right_distance = kth_ancestor(root.right, k, n);

        if(left_distance == -1 && right_distance == -1)
            return -1;
        int max = Math.max(left_distance, right_distance) + 1;
        if (max == k)
            System.out.println(root.data);
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kth_ancestor(root, 2, 8);
    }
}
