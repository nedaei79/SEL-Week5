package calculator;

public class Calculator {

    public double getSqrtOfDivision(int value1, int value2) {
        if (value2 == 0) {
            return -1.0;
        }

        double division = (double) value1 / (double) value2;

        if (division < 0) {
            return -2.0;
        }

        return Math.sqrt(division);
    }
}
