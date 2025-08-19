import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cheapest_flights_within_K_stops {
    static class Edge{
        int src, dest, weight;
        Edge(int s, int d, int w){
            src = s;
            dest = d;
            weight = w;
        }
    }
    static class Info{
        int src;
        int cost;
        int stops;
        Info(int s, int c, int st){
            src = s;
            cost = c;
            stops = st;
        }
    }
    public static void createGraph(int[][]flight, ArrayList<Edge>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int cost = flight[i][2];

            Edge e = new Edge(src,dest,cost);
            graph[src].add(e);
        }
    }
    public static int cheapest(int[][]flight, int src, int dest, int k, int n){
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flight, graph);

        int []dist = new int[n];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops>1)
                break;
            for (int i = 0; i < graph.length; i++) {
                Edge e = graph[curr.src].get(i);

                int u = e.src;
                int v = e.dest;
                int cost = e.weight;

                if(curr.cost + cost < dist[v] && curr.stops<=k){
                    dist[v] = curr.cost+cost;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
       return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }
}
