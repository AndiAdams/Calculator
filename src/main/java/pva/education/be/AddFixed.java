package pva.education.be;

import java.util.Arrays;

public class AddFixed {

    public Fixed calc(Fixed first, Fixed second) {
        Integer[] firstRest = first.getRest();
        Integer[] secondRest = second.getRest();

        Integer smallestLength = Math.min(firstRest.length, secondRest.length);
        Integer[] result = firstRest.length > secondRest.length ? Arrays.copyOf(firstRest, firstRest.length) : Arrays.copyOf(secondRest, secondRest.length);

        for(int i = 0; i < smallestLength; i++){
            result[i] = firstRest[i] + secondRest[i];
        }

        //TODO: Calculation of overflow is still wrong. Overflow method wieder reintun?
        int afterComma = afterComma(result[0]);
        result[0] = afterComma;
        return new Fixed(first.getReal() + second.getReal() + (result[0] - afterComma), afterComma); //TODO: Create Constructor with int-array
    }

    private Integer afterComma(Integer value){
        if(value > 9){
            value -= 10;
        }

        return value;
    }
}
