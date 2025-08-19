import java.util.ArrayList;
import java.util.PriorityQueue;

public class Minimum_Spanning_Tree {
    public  class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }
    public static class Pair implements Comparable<Pair>{
        int vertex;
        int weight;
        public Pair(int v, int w){
            this.vertex = v;
            this.weight = w;
        }
        @Override
        public int compareTo(Pair p2){
            return this.weight-p2.weight;
        }
    }
    public static int Prims(ArrayList<Edge>[]graph){
        boolean[]visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int final_cost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.vertex]){
                visited[curr.vertex] = true;
                final_cost+= curr.weight;
                for (int i = 0; i < graph[curr.vertex].size(); i++) {
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }
        return final_cost;
    }
}
