// This is the java code for Next Permutation of #GFG160
import java.util.Arrays;
class Solution {
    void nextPerm(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if(i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
    }
    public void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
    public void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
public class nextPerm {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int[] arr = {2, 4, 6, 1, 7, 9};
        ob.nextPerm(arr);
        System.out.println(Arrays.toString(arr));
    }
}