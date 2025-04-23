class Solution {
    // Function to find maximum product subarray
    public static int maxProduct(int[] arr) {
        int maxx = arr[0];
        int minn = arr[0];
        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int tempMax = maxx;
            int tempMin = minn;
            maxx = Math.max(curr, Math.max(tempMax * curr, tempMin * curr));
            minn = Math.min(curr, Math.min(tempMax * curr, tempMin * curr));
            res = Math.max(res, maxx);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(int[] arr);
    }
}
