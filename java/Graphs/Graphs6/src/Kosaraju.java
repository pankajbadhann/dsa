import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void topological_sorting(ArrayList<Edge> graph[], boolean[] visited, Stack<Integer> s, int curr) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest])
                topological_sorting(graph, visited, s, e.dest);
        }
        s.push(curr);
    }

    public static void kosaraju(ArrayList<Edge> graph[], int v) {
//        Topological sorting
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i])
                topological_sorting(graph, visited, s, i);
        }
//        Traspose gragh
        ArrayList<Edge> t_graph[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            t_graph[i] = new ArrayList<Edge>();
            visited[i] = false;

        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                t_graph[e.dest].add(new Edge(e.dest, e.src));
            }
        }
//        step3
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                dfs(t_graph, curr, visited);
                System.out.println();
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited) {
        visited[curr] = true;
        System.out.println(curr);
        for (int i = 0; i < graph.length; i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest])
                dfs(graph, e.dest, visited);
        }
    }
}
