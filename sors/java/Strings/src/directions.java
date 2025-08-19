public class directions {
    public static float shortest_path(String path){
        int x = 0, y =0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'S')
                y--;
            else if (dir=='N')
                y++;
            else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        float ans = (float) Math.sqrt((x*x) + (y*y));

        return ans;
    }

    public static String substring(String s, int x, int y){
        String sub = "";

        for (int i = x; i<y; i++){
            sub +=(s.charAt(i));
        }
        return sub;
    }
    public static String largest(String[] fruits){
        String l = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(l.compareTo(fruits[i]) < 0)
                l = fruits[i];
        }
        return l;
    }

    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(shortest_path(s));
    }
}
