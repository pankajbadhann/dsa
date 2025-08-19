public class Queue_using_linked_list {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static int a[];
        static int size;
        static int rear;

        static Node head = null;
        static Node tail = null;

        Queue(int n) {
            a = new int[n];
            rear = -1;
        }

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //    add
        public static void add(int data) {
            Node node = new Node(data);
            if(head == null){
                head = tail = node;
                return;
            }
            tail.next = node;
            tail = node;
        }

        public static int peek() {
            if (isEmpty())
                return -1;
            return head.data;
        }

        //    remove
        public int remove() {
            if (isEmpty())
                return -1;
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }
            else {
                head = head.next;
            }
            return front;
        }
    }
}
