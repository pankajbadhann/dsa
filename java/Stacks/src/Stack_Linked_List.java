public class Stack_Linked_List {
    public class Stack{
        static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        static class StackB{
            static Node head = null;

            public static boolean isEmpty(){
               return head == null;
            }
//            push
            public static void push(int data){
                if(head == null)
                    head = new Node(data);
                Node node = new Node(data);
                node.next = head;
                head = node;
            }

            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }
            public static int peek(){
                if (isEmpty())
                    return -1;
                return head.data;
            }

            public static void main(String[] args) {
                StackB s = new StackB();
                s.push(8);
                s.push(9);
                s.push(10);
                System.out.println(s.pop());
                System.out.println(s.peek());

            }
        }
    }
}
