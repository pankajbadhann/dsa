import java.util.PriorityQueue;

public class Connecting_Cities {

    public static class Edge implements Comparable<Edge>{

        int dest;
        int cost;
        public Edge(int dest, int cost){
            this.cost = cost;
            this.dest = dest;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }
    public static int cost(int [][]cities){
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        boolean[] visited = new boolean[cities.length];
        queue.add(new Edge(0,0));
        int final_cost = 0;
        while(!queue.isEmpty()){
            Edge curr = queue.remove();
            if(!visited[curr.dest]){
                visited[curr.dest] = true;
                final_cost+=curr.cost;
                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i]!=0){
                        queue.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return final_cost;
    }

    public static void main(String[] args) {
        int[][] cities = {
                {0, 1, 3, 0, 0},
                {1, 0, 1, 3, 10},
                {3, 1, 0, 1, 0},
                {0, 3, 1, 0, 2},
                {0, 10, 0, 2, 0}
        };
        System.out.println(cost(cities));
    }

}
