import java.util.Stack;

public class Reverse_a_Stack {
    public static void push_at_bottom(Stack<Integer>stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        push_at_bottom(stack, data);
        stack.push(top);
    }
    public static void reverse_Stack(Stack<Integer>stack){
        if(stack.isEmpty())
            return;
        int top = stack.pop();
        reverse_Stack(stack);
        push_at_bottom(stack, top);
    }
    public static void print(Stack<Integer>stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse_Stack(stack);
        print(stack);
    }
}
