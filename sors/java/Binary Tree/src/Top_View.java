import java.util.LinkedList;
import java.util.Queue;

public class Top_View {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelOrder(Node root){
        if(root == null)
            return;
        Queue<Integer> q = new LinkedList<>();
        q.add(root.data);
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int val = q.poll();
                System.out.print(val + " ");
                if (root.left != null)
                    q.add(root.left.data);
                if (root.right != null)
                    q.add(root.right.data);
            }
        }
        System.out.println();
    }

}
