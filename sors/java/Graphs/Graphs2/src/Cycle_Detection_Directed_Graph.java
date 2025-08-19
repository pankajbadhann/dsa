import java.util.ArrayList;

public class Cycle_Detection_Directed_Graph {
    public static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static boolean cycle(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(helper(graph,visited,stack,i))
                    return true;
            }
        }
        return false;
    }
    public static boolean helper(ArrayList<Edge>[] graph, boolean[] visited, boolean[] stack, int curr){
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]&&helper(graph, visited, stack, e.dest))
                return true;
            if(stack[e.dest])
                return true;
        }
        return false;
    }
    public static void Create_graph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        // graph[1].add(new Edge(1,0));
        // graph[2].add(new Edge(2,3));
        // graph[3].add(new Edge(3,0));
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[1];
        Create_graph(graph);
        System.out.println(cycle(graph));
    }
}
