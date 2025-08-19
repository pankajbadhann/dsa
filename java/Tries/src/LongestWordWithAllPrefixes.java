import java.util.ArrayList;

public class LongestWordWithAllPrefixes {
    public static class Node {
        boolean eow = false;
        Node[] children = new Node[26];
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null)
                curr.children[idx] = new Node();
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String result = "";

    public static void longest_Word(Node root, StringBuilder temp) {
        if (root == null)
            return;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
                longest_Word(root.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);//backtrack
            }
        }
    }

    public static void main(String[] args) {
        String[] word = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        longest_Word(root, new StringBuilder(""));
        System.out.println(result);
    }
}
