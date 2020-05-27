package pva.education.be;

import pva.education.api.Calculator;

public class DivisionCalculator implements Calculator {

    private SubCalculator subCalculator = new SubCalculator();
    private SEBCheckerImpl sebChecker = new SEBCheckerImpl();

    @Override
    public Number calc(Number first, Number second) {

        int i = 0;
        for (; sebChecker.calc(first, second).doubleValue() >= 0; i++) {
            first = subCalculator.calc(first, second);
        }
        return i;
    }
}
