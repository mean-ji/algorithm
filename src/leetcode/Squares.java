package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Squares {
    public int[] sortedSquares(int[] nums) {
        List<Integer> squares = new ArrayList<>();
        for (int num : nums) {
            squares.add(num * num);
        }

        Collections.sort(squares);

        return squares.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
