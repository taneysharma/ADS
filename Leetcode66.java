import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int[] digits = {1,2,3};  
        Solution sol = new Solution();
        int[] result = sol.plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
