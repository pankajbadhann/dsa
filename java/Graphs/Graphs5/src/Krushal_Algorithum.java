import java.util.ArrayList;
import java.util.Collections;

public class Krushal_Algorithum {
    public static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt-e2.wt;
        }
    }
    public static int n = 4;
    public static int[]parent = new int[n];
    public static int[]rank = new int[n];
    public static void init(){
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }
    public static int find(int x){
        if(x == parent[x])
            return x;
        return parent[x] = find(parent[x]);
    }
    public static void union(int a, int b){
        int parent_a = find(a);
        int parent_b = find(b);

        if(parent_a == parent_b){
            parent[parent_b] = parent_a;
            rank[parent_a]++;
        } else if (parent_b>parent_a) {
            parent[parent_a] = parent_b;
        }else {
            parent[parent_b] = parent_a;
        }
    }
    public static int Krushal(ArrayList<Edge> e, int v){
        init();
        Collections.sort(e);
        int ans=0;
        int count = 0;
        for (int i = 0; count < v-1; i++) {
            Edge curr = e.get(i);
            int parent_a = find(curr.src);
            int parent_b = find(curr.dest);
            if(parent_a!=parent_b){
                union(parent_a,parent_b);
                ans += curr.wt;
                count++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Edge> arrayList = new ArrayList<>();
        arrayList.add(new Edge(0,1,10));
        arrayList.add(new Edge(0,2,15));
        arrayList.add(new Edge(0,3,30));
        arrayList.add(new Edge(1,3,40));
        arrayList.add(new Edge(2,3,50));
        System.out.println(Krushal(arrayList,4));
    }
}
