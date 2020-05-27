package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalculatorTest {

    @Test
    public void testCalc() {
        SubCalculator subCalculator = new SubCalculator();
        Number result = subCalculator.calc(2, 2);
        Assert.assertEquals(result, 0);
    }
}
