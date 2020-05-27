package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MutliplyCalculatorTest {

    @Test
    public void testCalc() {
        MutliplyCalculator mutliplyCalculator = new MutliplyCalculator();
        Number result = mutliplyCalculator.calc(4, 3);
        Assert.assertEquals(result, 12);
    }
}