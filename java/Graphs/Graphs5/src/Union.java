public class Union {
    static int n = 7;
    static int []par = new int[n];
    static int []rank = new int[n];
    public static void init(){
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x])
            return x;
        return par[x] = find(par[x]);
    }
    public static void union(int a, int b){
        int parent_a = find(a);
        int parent_b=find(b);

        if (rank[parent_a]==rank[parent_b]){
            par[parent_b] = parent_a;
            rank[parent_a]++;
        } else if (par[parent_a]>par[parent_b]) {
            par[parent_b] = parent_a;
        } else {
            par[parent_a] = parent_b;
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
    }
}
