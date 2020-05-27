package pva.education.be;

import pva.education.api.Calculator;

public class DivisionCalculator implements Calculator {

    private SubCalculator subCalculator = new SubCalculator();
    private MutliplyCalculator mutliplyCalculator = new MutliplyCalculator();
    private SEBCheckerImpl sebChecker = new SEBCheckerImpl();
    private final static int PRECISION = 6;
    private int calcPrecision = PRECISION;

    @Override
    public Number calc(Number first, Number second) {

        if (calcPrecision <= 0) {
            return first;
        }

        int i = 0;
        for (; sebChecker.calc(first, second).doubleValue() >= 0; i++) {
            System.out.println("First: " + first + " " +  "Second: " + second);
            first = subCalculator.calc(first, second);
        }

        if (sebChecker.calc(first, 0).doubleValue() != 0) {
            first = mutliplyCalculator.calc(first, 10);
            calcPrecision = calcPrecision - 1;
            first = calc(first, second);
        }

        System.out.println(first);
        return i;
    }
}
