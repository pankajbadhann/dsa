import java.util.Deque;
import java.util.LinkedList;

public class Stack_and_Queue_using_Deque {
    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addFirst(data);
        }

        public int pop() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }

        public static void main(String[] args) {
            Stack stack = new Stack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
    }

    public static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }

        public static void main(String[] args) {
            Queue queue = new Queue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            System.out.println(queue.remove());
            System.out.println(queue.peek());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
        }
    }
}
