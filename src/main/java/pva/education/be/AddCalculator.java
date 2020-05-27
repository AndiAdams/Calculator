package pva.education.be;

import pva.education.api.Calculator;

public class AddCalculator<T extends  Number> implements Calculator<T>  {
    public T calc(Number first, Number second) {
        return first. + second; //TODO: NumbersCalculieren
    }
}
