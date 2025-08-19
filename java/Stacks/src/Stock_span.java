import java.util.Stack;

public class Stock_span {
     public static void stock_span(int []stocks, int []span){
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i <stocks.length ; i++) {
            int curr_price = stocks[i];
            while (!stack.isEmpty() && curr_price>stocks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
            }
            else {
                int prev_high = stack.peek();
                span[i] = i - prev_high;
            }
            stack.push(i);
        }

    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] span = new int[price.length];
        stock_span(price, span);
        for (int i = 0; i <span.length ; i++) {
            System.out.println(span[i]);
        }
    }
}
