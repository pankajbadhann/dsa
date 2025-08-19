package Arrays_questions;

public class Q4 {
    public static int trapped_water(int[] height) {
        int trapped_water = 0;
        int[] lh = new int[height.length];
        int[] rh = new int[height.length];
        lh[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            lh[i] = Math.max(height[i], lh[i - 1]);
        }
        rh[rh.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rh[i] = Math.max(height[i], rh[i + 1]);
        }
        int[] water_level = new int[height.length];
        for (int i = 0; i < height.length - 1; i++) {
            water_level[i] = Math.min(lh[i], rh[i]);
            trapped_water += water_level[i] - height[i];
        }
        return trapped_water;
    }

    public static void main(String[] args) {
//        int [] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int [] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trapped_water(height));
    }
}
