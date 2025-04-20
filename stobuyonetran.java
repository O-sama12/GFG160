class stobuyonetran {
    public static int maximumProfit(int prices[]) {
        int initialPrice = prices[0], res = 0;
        for(int i = 0; i < prices.length; i++) {
            initialPrice = Math.min(initialPrice, prices[i]);
            res = Math.max(res, prices[i] - initialPrice);
        }
        return res;
    }    
    public static void main(String[] args) {
        int arr[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(arr));
    }
}
