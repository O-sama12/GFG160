class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        String str = s.trim();
        int sign = 1, i = 0;
        long num = 0;
        if(str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i < str.length() && Character.isDigit(str.charAt(i))) {
            num = num * 10 + (str.charAt(i) - '0');
            if(sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * num);
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        String input1 = "42";
        String input2 = "   -42";
        String input3 = "4193 with words";
        String input4 = "words and 987";
        String input5 = "-91283472332";
        System.out.println(solution.myAtoi(input1));
        System.out.println(solution.myAtoi(input2));
        System.out.println(solution.myAtoi(input3));
        System.out.println(solution.myAtoi(input4));
        System.out.println(solution.myAtoi(input5));
}
