package leetcode;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curSum = 0;
        int result = 0;

        for (int i : nums) {
            if (i == 0) {
                result = Math.max(curSum, result);
                curSum = 0;
            } else {
                curSum += i;
            }
        }

        return Math.max(curSum, result);
    }
}
