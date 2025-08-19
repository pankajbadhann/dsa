import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs {
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src, int dest, int weight){
            this.dest=dest;
            this.src=src;
            this.weight=weight;
        }
    }

    public static void bfs(ArrayList<Edge>[]graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vist = new boolean[graph.length];

        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vist[curr]){
                System.out.println(curr);
                vist[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[]graph, boolean[] visit, int curr){
//        vist
        System.out.println(curr);
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfs(graph, visit, e.dest);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean[] visit = new boolean[V];
//        0-vertex
        graph[0].add(new Edge(0,1,1));
//        1-vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,1));
//        2-vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,1));
//        3-vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,2,1));
//        4-vertex
        graph[4].add(new Edge(4,2,1));

//        2's neighbors
//        for (int i = 0; i < graph[2].size(); i++) {
//            Edge e = graph[2].get(i);
//            System.out.println(e.dest);
//        }
        bfs(graph);
        dfs(graph,visit,0);
    }
}
