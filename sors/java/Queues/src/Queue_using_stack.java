import java.util.Stack;

public class Queue_using_stack {
    public static class Queue{
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty())
                s1.push(s2.pop());
        }
        public int remove(){
            if(isEmpty())
                return -1;
            return s1.pop();
        }
        public int peek(){
            if (isEmpty())
                return -1;
            return s1.peek();
        }

        public static void main(String[] args) {
            Queue queue = new Queue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
        }
    }
}
