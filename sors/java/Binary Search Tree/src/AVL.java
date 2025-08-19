public class AVL {
    public static class Node{
        int data, height;
        Node left, right;
        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;
    public static int height(Node root){
        if(root == null)
            return 0;
        return root.height;
    }
    public static int max(int a, int b){
        return (a>b)?a:b;
    }
    public static Node insert(Node root, int key){
        if(root == null)
            return new Node(key);
        if(key<root.data)
            root.left = insert(root.left, key);
        else if (key>root.data)
            root.right = insert(root.right, key);
        else
            return root;//Duplicate keys are not allowed

//        update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));
//        Balance factor
        int bf = getBalance(root);
//        LL case
        if(bf>1 && key<root.left.data)
            return rightRotate(root);
//        RR case
        if(bf<-1 && key>root.right.data)
            return leftRotate(root);
//        LR case
        if(bf>1 && key>root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
//        RL case
        if(bf<-1 && key<root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static int getBalance(Node root){
        if (root == null)
            return 0;
        return height(root.left)-height(root.right);
    }
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

//        Perform rotation
        y.left = x;
        x.right = T2;
//        Update Height
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }
    public static Node rightRotate(Node x){
        Node y = x.left;
        Node T2 = y.right;
//        Perform rotations
        y.right = x;
        x.left = T2;
//        Update Height
        x.height = max(height(x.left), height(x.right))+1;
        y.height = max(height(y.left), height(y.right))+1;

        return y;
    }
}
