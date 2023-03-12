package leetcode;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        Permutation c = new Permutation();
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(c.buildArray(nums)));
    }

    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}
