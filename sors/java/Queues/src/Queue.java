public class Queue {
    static int a[];
    static int size;
    static int rear;

    Queue(int n){
        a = new int[n];
        rear = -1;
    }
    public static boolean isEmpty(){
        return rear == -1;
    }
//    add
    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        a[rear] = data;
    }
//    remove
    public int remove(){
        if (isEmpty())
            return -1;
        int front = a[0];
        for (int i = 0; i < rear; i++) {
            a[i] = a[i+1];
        }
        rear--;
        return front;
    }
    public static int peek(){
        if (isEmpty())
            return -1;
        return a[0];
    }
}
