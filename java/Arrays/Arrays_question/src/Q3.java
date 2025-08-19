public class Q3 {
    public static int buy_and_sell_pencil(int[] prices){
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buy_price<prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit,profit);
            }
            else {
                buy_price=prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int [] prices = {7,6,3,1};
        System.out.println(buy_and_sell_pencil(prices));
    }
}
