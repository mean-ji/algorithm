package programmers;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public Integer dfs(int[] numbers, int target, int answer, int depth) {
        if (numbers.length == depth) {
            if (answer == target) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return dfs(numbers, target, answer + numbers[depth], depth + 1)
                    + dfs(numbers, target, answer - numbers[depth], depth + 1);
        }
    }
}
