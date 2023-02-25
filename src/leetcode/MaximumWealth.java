package leetcode;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] account : accounts) {
            int curWealth = 0;

            for(int bank : account) {
                curWealth += bank;
                maxWealth = Math.max(curWealth, maxWealth);
            }
        }

        return maxWealth;
    }
}
