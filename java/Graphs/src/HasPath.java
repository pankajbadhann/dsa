import java.util.ArrayList;

public class HasPath {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, boolean[]visited, int src, int dest){
        if(src == dest)
            return true;
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
//            e.dest = neighbor
            if(!visited[e.dest] && hasPath(graph, visited,e.dest, dest)){
                return true;
            }
        }
        return false;
    }
}
