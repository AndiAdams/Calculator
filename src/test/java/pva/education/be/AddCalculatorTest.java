package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCalculatorTest {

    @Test
    public void testCalc() {
        AddCalculator addCalculator = new AddCalculator();
        Number result = addCalculator.calc(1, 2);
        Assert.assertEquals(result, 3);
    }
}