package pva.education.be;

import pva.education.api.Calculator;

import java.util.Arrays;

public class DivisionCalculator implements Calculator {

    private SubCalculator subCalculator = new SubCalculator();
    private AddCalculator addCalculator = new AddCalculator();
    private MutliplyCalculator mutliplyCalculator = new MutliplyCalculator();
    private SEBCheckerImpl sebChecker = new SEBCheckerImpl();
    private Number[] comma;

    private Number[] setPrecision(double value){

        Number[] numbers = new Number[0];

        while(value <= 1.1){
            double result = 0;
            numbers = Arrays.copyOf(numbers, numbers.length + 1 );
            numbers[numbers.length - 1] =  value;
            System.out.println(numbers[numbers.length - 1]);

            for(int i = 0; i < 10; i++){
                result += value;
              //  System.out.println("-> " + result);
            }
            value = result;
        }

        reverse(numbers);
        return numbers;
    }

    private void reverse(Number[] numbers){
        for(int i = 0, j = 0; i < numbers.length; i += 2, j++){
            Number tmp = numbers[j];
            numbers[j] = numbers[numbers.length - 1 - j];
            numbers[numbers.length - 1 - j] = tmp;
        }
        for(int i = 0; i < numbers.length; i++){
             System.out.println("-> " + numbers[i]);
        }
    }

    public DivisionCalculator(double precision){
        this.comma = setPrecision(precision);
    }

    public DivisionCalculator(){
       comma = setPrecision(0.000001);
    }
    @Override
    public Number calc(Number first, Number second) {

        return calc(first, second, 0);
    }

    private Number calc(Number first, Number second, int digitPosition){

        Number result = 0;
        if (comma.length-1 < digitPosition) {
            return result;
        }

        for (; sebChecker.calc(first, second).doubleValue() >= 0; result = addCalculator.calc(result, 1)) {
            first = subCalculator.calc(first, second);
        }

        Number subSum = 0;
        if (sebChecker.calc(first, 0).doubleValue() != 0) {
            first = mutliplyCalculator.calc(first, 10);
            subSum = addCalculator.calc(subSum, calc(first, second, ++digitPosition));
        }

        System.out.println("Result: "+ result +" subSum: " + subSum + " Digit Position: " + digitPosition);

        result = mutliplyCalculator.calc(comma[digitPosition-1], result);

        return addCalculator.calc(result, subSum);
    }
}
