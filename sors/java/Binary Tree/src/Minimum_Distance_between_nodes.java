public class Minimum_Distance_between_nodes {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int minimum_distance(Node root, int n1, int n2) {
       Node lca = lca(root, n1, n2);
       int dist1 = lca_distance(lca, n1);
       int dist2 = lca_distance(lca, n2);
       return dist1+dist2;
    }
    public static int lca_distance(Node root, int n){
        if(root == null)
            return -1;
        if(root.data == n)
            return 0;
        int left_dist = lca_distance(root.left, n);
        int right_dist = lca_distance(root.right, n);
        if (left_dist + right_dist == 0)
            return -1;
        else if (left_dist == -1)
            return right_dist + 1;
        else
            return left_dist + 1;
    }
    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2)
            return root;
        Node left_lca = lca(root.left, n1, n2);
        Node right_lca = lca(root.right, n1, n2);
        if (left_lca == null)
            return right_lca;
        if (right_lca == null)
            return left_lca;
        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minimum_distance(root, 2, 3));
    }
}
