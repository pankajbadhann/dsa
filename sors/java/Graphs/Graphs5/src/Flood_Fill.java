public class Flood_Fill {
    public static int[][] floodFill(int [][]image, int sr, int sc, int color){
        boolean[][]visited = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,visited, image[sr][sc]);
        return image;
    }
    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] visited, int org_color){

        if (sr>= image.length || sc>=image[0].length || sc<0 || sr<0 || visited[sr][sc] || image[sr][sc]==color){
            return;
        }

//        left
        helper(image, sr, sc-1, color, visited, org_color);
//        right
        helper(image, sr, sc+1, color, visited, org_color);
//        up
        helper(image, sr-1, sc, color, visited, org_color);
//        down
        helper(image, sr+1, sc, color, visited, org_color);
    }
}
