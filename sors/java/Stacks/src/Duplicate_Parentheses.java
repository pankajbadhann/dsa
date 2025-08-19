import java.util.Stack;

public class Duplicate_Parentheses {
    public static boolean duplicate_parentheses(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            closing
            if (ch == ')'){
                int count = 0;
                while (stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                if(count<1)
                    return true; //duplicate
                else
                    stack.pop(); // opening pair
            }
//            opening, operator, operands
            else
                stack.push(ch);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(duplicate_parentheses("((a+b))"));
    }
}
