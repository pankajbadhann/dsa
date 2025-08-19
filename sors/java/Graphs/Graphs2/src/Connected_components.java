import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Connected_components extends Graph{
    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dfs_helper(visited, graph, i);
        }
    }
    public static void dfs_helper(boolean[] visited, ArrayList<Edge>[] graph, int src){
        System.out.println(src);
        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest]){
                dfs_helper(visited, graph, e.dest);
            }
        }
    }
    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i])
                bfs_helper(graph, visited);
        }
    }
    public static void bfs_helper(ArrayList<Edge>[] graph, boolean[]visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()){
            int curr = q.remove();

            if (!visited[curr]){
                System.out.println(curr);
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[n];
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,6));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,4));
        graph[6].add(new Edge(6,5));
        dfs(graph);
    }
}
