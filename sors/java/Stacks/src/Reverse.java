import java.util.Stack;

public class Reverse {
    public static String reverse(String s){
        if (s.length() == 0 || s.length()==1)
            return s;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }
}
