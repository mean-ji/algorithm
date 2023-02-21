package leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Loop1 :
        for (int i = 0; i < nums.length; i++) {
            Loop2 :
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break Loop1;
                }
            }
        }

        return result;
    }
}
