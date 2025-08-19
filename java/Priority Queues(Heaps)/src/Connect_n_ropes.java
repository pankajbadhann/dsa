import java.util.PriorityQueue;

public class Connect_n_ropes {
    public static void main(String[] args) {
        int []ropes ={2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost = 0;
        while(pq.size()>1){
            int a = pq.remove();
            int b = pq.remove();
            pq.add(a+b);
        }
        System.out.println(pq.remove());
    }
}
