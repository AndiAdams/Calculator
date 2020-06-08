package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddFixedTest {

    @Test
    public void testCalcOverflow() {
        Fixed first = new Fixed(1, 5);
        Fixed second = new Fixed(1, 5);
        AddFixed adder = new AddFixed();

        Fixed fixed = adder.calc(first, second);
        Assert.assertEquals(fixed.toDouble(), 3.0);
    }

    @Test
    public void testCalcStandard() {        //TODO: Big numbers dont work
        Fixed first = new Fixed(1, 5);
        Fixed second = new Fixed(1, 40004);
        AddFixed adder = new AddFixed();

        Fixed fixed = adder.calc(first, second);
        Assert.assertEquals(fixed.toDouble(), 2.9);
    }

    @Test
    public void testCalcString() {        //TODO: Big numbers dont work
        Fixed first = new Fixed(1, 501);
        Fixed second = new Fixed(1, "004");
        AddFixed adder = new AddFixed();

        Fixed fixed = adder.calc(first, second);
        Assert.assertEquals(fixed.toDouble(), 2.504);
    }

    @Test
    public void testCalcStringOverflow() {        //TODO: Big numbers dont work
        Fixed first = new Fixed(1, 999);
        Fixed second = new Fixed(1, "002");
        AddFixed adder = new AddFixed();

        Fixed fixed = adder.calc(first, second);
        Assert.assertEquals(fixed.toDouble(), 2.504);
    }

    @Test
    public void testCalcCommaArithmetic() {

        Fixed first = new Fixed(1, 521);
        Fixed second = new Fixed(1, 521);
        AddFixed adder = new AddFixed();

        Fixed fixed = adder.calc(first, second);
        Assert.assertEquals(fixed.toDouble(), 3.042);

    }
}