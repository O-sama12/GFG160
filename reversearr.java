import java.util.*;
public class reversearr{
    public static void main(String[] args){
        int[] arr = {1,3,2,5,6,9};
        int left = 0, right = arr.length - 1;
        while(left < right){
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

