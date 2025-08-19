import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Tree_Traversal extends Build_Tree {

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void level_order(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node node = q.remove();
            if (node == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(node.data + " ");
                if (node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
    }

    static int idx = -1;

    public static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1)
            return null;
        Node node = new Node(nodes[idx]);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max =0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if (curr == null){
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <=max ; i++) {
            System.out.println(map.get(i).data);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
//        preorder(root);
//        inorder(root);
//        postorder(root);
//        level_order(root);
        topView(root);
    }

}
