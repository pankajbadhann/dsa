import java.util.ArrayList;
import java.util.Arrays;

public class Detect_cycle extends Graph {
    public static boolean detect_cycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        boolean ans = false;
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i] && helper(graph, visited, i, -1))
                ans = true;
        }
        return ans == true;
    }

    public static boolean helper(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < graph.length; i++) {
            Edge e = graph[curr].get(i);
            // case1 :
            if (visited[e.dest] && e.dest != parent)
                return true;
            // case 2 :
            else if (!visited[e.dest])
                if (helper(graph, visited, e.dest, curr))
                    return true;
            // case 3:
            continue;
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[4];
        for (int i = 0; i < graph.length; i++)
        graph[i] = new ArrayList<>();
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
        System.out.println(detect_cycle(graph));

       
    }

}
