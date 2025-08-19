package Arrays_questions;

public class Q3 {
    public static int max_profit(int[] price) {
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (buy_price < price[i]) {
                int profit = price[i] - buy_price;
                max_profit = Math.max(profit, max_profit);
            } else
                buy_price = price[i];
        }
        return max_profit;
    }

    public static void main(String[] args) {
        System.out.println(max_profit(new int[]{7, 6, 4, 3, 1}));
    }
}
