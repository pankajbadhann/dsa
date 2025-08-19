import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    public static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int path;
        int src;

        public Pair(int src, int path) {
            this.src = src;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src)
                dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[graph.length];
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.src])
                visited[curr.src] = true;
            for (int i = 0; i < graph[curr.src].size(); i++) {
                Edge e = graph[curr.src].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.weight;
                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 40));
        graph[1].add(new Edge(1, 2, 10));
        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 4, 2));
        graph[4].add(new Edge(4, 5, 3));
        graph[4].add(new Edge(4, 6, 8));
        graph[5].add(new Edge(5, 6, 3));
        dijkstra(graph, 0);
    }
}
