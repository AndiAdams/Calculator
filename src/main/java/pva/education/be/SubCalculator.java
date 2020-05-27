package pva.education.be;

import pva.education.api.Calculator;

public class SubCalculator implements Calculator {

    public Number calc(Number first, Number second) {

        if (first instanceof Double || second instanceof Double) {
            return first.doubleValue() - second.doubleValue();
        }

        if (first instanceof Float || second instanceof Float) {
            return first.floatValue() - second.floatValue();
        }

        if (first instanceof Long || second instanceof Long) {
            return first.longValue() - second.longValue();
        }

        if (first instanceof Integer || second instanceof Integer) {
            return first.intValue() - second.intValue();
        }

        if (first instanceof Short || second instanceof Short) {
            return first.shortValue() - second.shortValue();
        }

        if (first instanceof Byte || second instanceof Byte) {
            return first.byteValue() - second.byteValue();
        }

        throw new IllegalStateException("Found not implemented Datatype: " + first.getClass().getName() + " , " + second.getClass().getName());
    }

}
