public class MaxPro {
    public static int maxProfit(int[] prices) {
        int n = prices.length, res = 0;
        for(int i = 1; i < n; i++) {
            if(prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {1, 3, 55, 7,84, 839, 938};
        int res = maxProfit(prices);
        System.out.println(res);
    }
}
