import java.util.ArrayList;

public class Stack {
    public class Stack_s{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

//        push
        public static void push(int data){
            list.add(data);
        }
//        pop
        public static int pop(){
            int top = list.get(list.size());
            list.remove(top);
            return top;
        }
//        peek
        public static int peek(){
            return list.get(list.get(list.size()));
        }
    }
}
