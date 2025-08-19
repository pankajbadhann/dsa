import java.util.Stack;

public class Valid_parentheses {
    public static boolean valid_parentheses(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            opening
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

//            closing
            else{
               if(stack.isEmpty())
                   return false;
               if((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')){
                   stack.pop();
               }
               else
                   return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(valid_parentheses("((){}[])"));
    }
}
