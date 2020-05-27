package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionCalculatorTest {

    @Test
    public void testCalc() {
        DivisionCalculator divisionCalculator = new DivisionCalculator();
        Number result = divisionCalculator.calc(7, 3);
        Assert.assertEquals(result, 2);
    }
}