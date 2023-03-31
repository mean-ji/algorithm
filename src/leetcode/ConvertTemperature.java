package leetcode;

import java.util.Arrays;

public class ConvertTemperature {
    public static void main(String[] args) {
        ConvertTemperature c = new ConvertTemperature();
        double celsius = 36.50;
        System.out.println(Arrays.toString(c.convertTemperature(celsius)));
    }

    public double[] convertTemperature(double celsius) {
        double[] result = new double[2];

        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;

        return result;
    }
}
