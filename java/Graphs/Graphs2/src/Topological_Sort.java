import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Topological_Sort {
    public static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void topological_Sort(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                helper(graph, visited, s, i);
            }
        }
        while (!s.isEmpty())
            System.out.println(s.pop());
    }

    public static void helper(ArrayList<Edge>[] graph, boolean[] visited, Stack<Integer> s, int curr) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest])
                helper(graph, visited, s, e.dest);
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[n];
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 6));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 4));
        graph[6].add(new Edge(6, 5));
        topological_Sort(graph);
    }
}
