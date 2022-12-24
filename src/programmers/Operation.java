package programmers;

public class Operation {
    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        int answer = 0;
        boolean val = (-50000 <= num1 && 50000 >= num1) && (-50000 <= num2 && 50000 >= num2);

        if (val) {
            return num1 - num2;
        }

        return answer;
    }

    public int divide(int num1, int num2) {
        int answer = 0;
        boolean val = (0 < num1 && 100 >= num1) && (0 < num2 && 100 >= num2);

        if (val) {
            return num1 / num2;
        }

        return answer;
    }

    public int divide2(int num1, int num2) {
        int answer = 0;
        boolean val = (0 < num1 && 100 >= num1) && (0 < num2 && 100 >= num2);

        if (val) {
            double num1Double = num1;
            double num2Double = num2;
            double result = (num1Double / num2Double) * 1000;

            answer = (int) Math.floor(result);
        }

        return answer;
    }

    public int mod(int num1, int num2) {
        int answer = -1;
        boolean val = (0 < num1 && 100 >= num1) && (0 < num2 && 100 >= num2);

        if (val) {
            return num1 % num2;
        }

        return answer;
    }
}
