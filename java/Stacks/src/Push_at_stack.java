import java.util.Stack;

public class Push_at_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        push_at_stack(stack, 4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void  push_at_stack(Stack<Integer>stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        push_at_stack(stack, data);
        stack.push(top);
    }
}
