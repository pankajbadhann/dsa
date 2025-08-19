public class Q4 {
    public static int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int left = 0, left_max = height[0];
        int right = height.length - 1, right_max = 0;
        int area = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] > left_max)
                    left_max = height[left];
                else
                    area += left_max - height[left];
                left++;
            } else {
                if (height[right] > right_max)
                    right_max = height[right];
                else
                    area += right_max - height[right];
                right--;
            }

        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }
}
