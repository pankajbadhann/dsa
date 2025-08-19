public class Buy_and_sell_stocks {
    public static int buy_and_sell(int[] prices){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(buy_price<prices[i]){ //profit
                int profit = prices[i]-buy_price; //today's profit
                max_profit = Math.max(max_profit, profit);
            }else {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        System.out.println(buy_and_sell(new int[]{7,1,5,3,6,4}));
    }
}
