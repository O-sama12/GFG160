class Maxcalc {
  public static int maxSum(int[] arr) {
    int curr = arr[0];
    int maxx = arr[0];
    for(int i = 1; i < arr.length; i++) {
      curr = Math.max(arr[i], curr + arr[i]);
      maxx = Math.max(maxx, curr);
    }
    return maxx;
  }

  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println("Maximum Subarray Sum: " + maxSum(arr));
  }
}
