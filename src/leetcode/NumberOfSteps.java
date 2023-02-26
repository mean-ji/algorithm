package leetcode;

public class NumberOfSteps {
    /**
     * num이 짝수이면 2로 나누어주고
     * 홀수이면 1을 빼고 다음 단계로 넘어간다.
     * 몇단계인지 리턴
     */
    public int numberOfSteps(int num) {
        int step = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step++;
        }

        return step;
    }
}
