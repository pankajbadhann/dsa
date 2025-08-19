import java.util.Stack;

public class Next_greater_element {
    public static void next_greater(int []arr){
        Stack<Integer> stack = new Stack<>();
        int []ans = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!stack.isEmpty()&& arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            }else{
                ans[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(ans [i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        next_greater(arr);
    }
}
