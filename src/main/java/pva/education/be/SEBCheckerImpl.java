package pva.education.be;

import pva.education.api.Calculator;

public class SEBCheckerImpl implements Calculator {

    private final SubCalculator subCalculator = new SubCalculator();

    public Number calc(Number first, Number second) {
        return subCalculator.calc(first, second);
    }

}
