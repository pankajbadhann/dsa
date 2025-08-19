import java.util.ArrayList;

public class Prefix_Problem {
    public static class Node {
        Node[] children = new Node[26];
        int freq;
        boolean eow;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null)
                curr.children[idx] = new Node();
            else
                 curr.freq++;
        }
        curr.eow = true;
    }
    public static ArrayList<String > findPrefix(Node root, String ans, ArrayList<String>result){
        if(root == null)
            return result;
        if (root.freq == 1){
            result.add(ans);
            return result;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i]!=null)
                findPrefix(root.children[i],ans+(char)(i+'a'),result);
        }
        return result;
    }
    public static void main(String[] args) {
        String []arr = {"zebra", "dog", "duck", "dove"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        root.freq = -1;
        System.out.println(findPrefix(root, "", new ArrayList<>()));
    }
}
