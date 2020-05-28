package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionCalculatorTest {

    @Test
    public void testCalc() {
        DivisionCalculator divisionCalculator = new DivisionCalculator();
        Number result = divisionCalculator.calc(7, 3);
        Assert.assertEquals(result, 2.3333333);
    }

    @Test
    public void testSetPrecision(){
        DivisionCalculator divisionCalculator = new DivisionCalculator(0.0001);
        Number result = divisionCalculator.calc(7, 3);
        Assert.assertEquals(result, 2.3333);
    }
}