import java.util.ArrayList;

public class BellmanFord {
    public static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }
    public static void bellmanFord(ArrayList<Edge>[]graph, int src){
        int []dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(i!=src)
                dist[i] = Integer.MAX_VALUE;
        }
        int V = graph.length;
//        algo
        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;
                    if(dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+wt)
                        dist[v] = dist[u]+wt;
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
}

