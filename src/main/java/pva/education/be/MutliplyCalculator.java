package pva.education.be;

import pva.education.api.Calculator;

public class MutliplyCalculator implements Calculator {

    private AddCalculator addCalculator = new AddCalculator();
    private SEBCheckerImpl sebChecker = new SEBCheckerImpl();

    @Override
    public Number calc(Number first, Number second) {

        Number result = 0;
        for (int i = 0; sebChecker.calc(second, i).doubleValue() > 0; i++) {
            result = addCalculator.calc(result, first);
        }
        return result;
    }
}
