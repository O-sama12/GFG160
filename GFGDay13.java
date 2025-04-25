class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test array
        int[] arr = {3, 4, -1, 1};

        // Output
        int result = sol.missingNumber(arr);
        System.out.println("Smallest missing positive number: " + result);
    }
}
