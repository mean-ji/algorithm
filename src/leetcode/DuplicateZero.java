package leetcode;

import java.util.Arrays;

public class DuplicateZero {
    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int a_idx = 0;
        int r_idx = 0;

        while (r_idx < result.length) {
            result[r_idx] = arr[a_idx];
            if (arr[a_idx] == 0 && r_idx + 1 < result.length) {
                result[r_idx + 1] = arr[a_idx];
                r_idx++;
            }
            r_idx++;
            a_idx++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}
