import java.util.ArrayList;

public class Tarjan {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void bridge(ArrayList<Edge>[] graph, int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i])
                dfs(graph, i, -1, dt, low, visited, time);
        }
    }
    public static void dfs(ArrayList<Edge>[]graph, int curr, int parent, int[] dt, int []low, boolean[]visited, int time){
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if(neigh == parent)
                continue;
            else if(!visited[neigh]){
                dfs(graph, neigh, curr, dt, low, visited, time);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (dt[curr]<low[neigh])
                    System.out.println("Bridge: "+curr+"-----"+ neigh);
            }
            else
                low[curr] = Math.min(low[curr],dt[neigh]);
        }
    }
}
