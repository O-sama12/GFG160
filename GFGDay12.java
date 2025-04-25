class Solution {

    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int total = 0;
        int curMaxSum = 0, curMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            curMaxSum = Math.max(curMaxSum + arr[i], arr[i]);
            maxSum = Math.max(curMaxSum, maxSum);

            curMinSum = Math.min(curMinSum + arr[i], arr[i]);
            minSum = Math.min(curMinSum, minSum);

            total += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = total - minSum;

        if (minSum == total) {
            // All elements are negative, so circular sum is invalid
            return normalSum;
        }

        return Math.max(normalSum, circularSum);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test array
        int[] arr = {8, -1, 3, 4};

        // Output
        int result = sol.circularSubarraySum(arr);
        System.out.println("Maximum Circular Subarray Sum: " + result);
    }
}
