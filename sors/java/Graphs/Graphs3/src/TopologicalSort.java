import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static class Edge {
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void topological_sort(ArrayList<Edge>[]graph){
        int []inDegree = new int[graph.length];
        helper(graph,inDegree);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (inDegree[i]==0)
                q.add(i);
        }
//        bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.println(curr);
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest]==0)
                    q.add(e.dest);
            }
        }
    }
    public static void helper(ArrayList<Edge>[]graph, int[] inDegree){ // used to calculate the indegree
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,6));
        graph[5].add(new Edge(5,6));

        topological_sort(graph);
    }
}
