import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartile_Graph extends Graph{
    public static boolean bipartile_graph(ArrayList<Edge>[] graph){
        int [] color = new int[graph.length];
        for (int i=0; i< color.length; i++) {
            color[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1){
                queue.add(i);
                color[i] = 0;
            }
            while(!queue.isEmpty()){
                int curr = queue.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge edge = graph[curr].get(j); //e.dest
                    if(color[edge.dest]==-1){
                        int next_color = color[curr] == 0? 1:0;
                        color[edge.dest] = next_color;
                        queue.add(edge.dest);
                    }
                    else if(color[edge.dest]==color[curr])
                        return false;
                }
            }
        }
        return true ;
    }
}
