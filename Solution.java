import java.util.*;

public class Solution {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length, count1 = 0, count2 = 0;
        Integer cand1 = null, cand2 = null;

        for (int num : nums) {
            if (Objects.equals(num, cand1)) count1++;
            else if (Objects.equals(num, cand2)) count2++;
            else if (count1 == 0) { cand1 = num; count1 = 1; }
            else if (count2 == 0) { cand2 = num; count2 = 1; }
            else { count1--; count2--; }
        }

        List<Integer> res = new ArrayList<>();
        count1 = count2 = 0;

        for (int num : nums) {
            if (Objects.equals(num, cand1)) count1++;
            else if (Objects.equals(num, cand2)) count2++;
        }

        if (count1 > n / 3) res.add(cand1);
        if (count2 > n / 3) res.add(cand2);

        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] votes = {1, 2, 3, 2, 2, 1, 1}; // You can test with any array
        List<Integer> result = sol.findMajority(votes);

        System.out.println("Majority candidates (more than n/3 votes): " + result);
    }
}
