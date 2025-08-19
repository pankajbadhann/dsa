import java.util.ArrayList;

public class Articulation_Point {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void articulation_point(ArrayList<Edge>[]graph, int v){
        int []dt = new int[v];
        int []low = new int[v];
        int time = 0;
        boolean[] visited = new boolean[v];
        boolean[] ap = new boolean[v];
        for (int i = 0; i <v ; i++) {
            if(!visited[i])
                dfs(graph, v, dt, low, time, visited, ap, i, -1);
        }
        for (int i = 0; i < v; i++) {
            if(ap[i])
                System.out.println(ap[i]);
        }
    }
    public static void dfs(ArrayList<Edge>[]graph, int v, int []dt, int []low, int time, boolean[]visited, boolean[]ap, int curr, int parent){
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (parent == neigh)
                continue;
            else if (visited[neigh])
                low[curr] = Math.min(low[curr], dt[neigh]);
            else{
                dfs(graph, v, dt, low, time, visited, ap, neigh, curr);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(parent!=-1 && dt[curr]<=low[neigh])
                    ap[curr] = true;
                children++;
            }
        }
        if(parent==-1 && children>1)
           ap[curr] = true;
    }
}
