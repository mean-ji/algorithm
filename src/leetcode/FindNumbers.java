package leetcode;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            String numStr = String.valueOf(num);
            if (numStr.length() % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}
