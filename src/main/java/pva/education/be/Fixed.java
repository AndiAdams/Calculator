package pva.education.be;

public class Fixed {
    private Integer real;
    private Integer[] rest;
//runter
    private Integer[] fillRest(String rest) {

        this.rest = new Integer[rest.length()];

        for (int i = rest.length() - 1; i >= 0; i--) {
            char sign = rest.charAt(i);
            if (sign < 48 || sign > 58) {
                throw new IllegalArgumentException("Passed String '" + rest + "' is not a valid number");
            }
            this.rest[i] = sign - 48;
        }

        return this.rest;
    }

    private Integer[] fillRest(Integer rest) {
        if(rest < 0){
            throw new IllegalArgumentException("Passed Number must not be negative");
        }

        Integer[] restResult = new Integer[length(rest)];

        for (int i = restResult.length - 1; i > -1; i--) {
            restResult[i] = rest % 10;
            rest /= 10;
        }

        return restResult;
    }

    private Double toRest(Integer[] values) {
        Double result = 0d;

        for (int i = values.length - 1; i > -1; i--) {
            result += values[i];
            result /= 10;
        }
        return result;
    }

    Fixed(Integer real, Integer rest) {
        this.real = real;
        this.rest = fillRest(rest);
    }

    Fixed(Integer real, String rest) {
        this.real = real;
        this.rest = fillRest(rest);
    }

    Fixed

    public Double toDouble() {
        return real + toRest(rest);
    }

    public Integer getReal() {
        return real;
    }

    public Integer[] getRest() {
        return rest;
    }

    public static Integer reverse(Integer value) {
        int result = 0;

        while (value != 0) {
            result *= 10;
            result += value % 10;
            value /= 10;
        }

        return result;
    }

    public static Integer length(Integer value) {
        int length = 0;
        while (value > 0) {
            value /= 10;
            length++;
        }
        return length;
    }

    public static Integer powerOfTen(int power) {
        Integer result = 1;
        for (int i = 0; i < power; i++) {
            result *= 10;
        }

        return result;
    }
}