import java.util.ArrayList;

public class All_path_to_destination {
    public static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
          this.src = s;
          this.dest = d;
        }
    }
    public static void all_paths(ArrayList<Edge>[]graph, int src, int dest, String s){
        if(src == dest){
            System.out.println(s+dest);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            all_paths(graph, e.dest, dest, s+src);
        }
    }
    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,6));
        graph[5].add(new Edge(5,6));
        all_paths(graph, 0, 3, "");
    }
}
