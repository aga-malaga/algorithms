package leetcode;

class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices2 = new int[]{1, 2, 3, 4, 5};
        int[] prices3 = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int profit = 0;
        int sell = 0;
        for (int i = 0; i < length - 1; i++) {
            if (prices[i] > prices[i + 1]){
                continue;
            }
            if (prices[i] < prices[i + 1]){
                profit -= prices[i];
                sell++;
            }
            if (sell > 0 && prices[i] < prices[i + 1] ){
                profit += prices[i + 1];
            }
        }
        return profit;
    }
}
