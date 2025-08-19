public class tiling {
    public static int fill_tiles(int n) { // 2*n
//        2. Base case
        if(n == 0 || n==1)
            return n;

//        1. Task
//           vertical choice
        int verticalTitles = fill_tiles(n-1);

//          horizontal choice
        int horizontalTitles = fill_tiles(n-2);

        int total_ways = horizontalTitles+verticalTitles;

        return total_ways;
    }

    public static void main(String[] args) {
        System.out.println(fill_tiles(3));
    }
}
