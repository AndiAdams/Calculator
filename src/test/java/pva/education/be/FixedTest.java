package pva.education.be;

import org.omg.CORBA.INTERNAL;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FixedTest {

    @Test
    public void testToDoubleZero() {
        Fixed fixed = new Fixed(0,0);
        Assert.assertEquals(fixed.toDouble(),0.0);
    }

    @Test
    public void testToDoubleUsual() {
        Fixed fixed = new Fixed(1,502);
        Assert.assertEquals(fixed.toDouble(),1.502);
    }

    @Test
    public void testToDoubleStringZero() {
        Fixed fixed = new Fixed(0,"0");
        Assert.assertEquals(fixed.toDouble(),0.0);
    }

    @Test
    public void testToDoubleString() {
        Fixed fixed = new Fixed(1,"004");
        Assert.assertEquals(fixed.toDouble(),1.004);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testToDoubleNegativeRest() {
        Fixed fixed = new Fixed(1,-5);
    }

    @Test
    public void testReverse() {
        Fixed fixed = new Fixed(0,0);
        int result = fixed.reverse(1234);
        Assert.assertEquals(result, 4321);
    }

    @Test
    public void testReverseZero() {
        Fixed fixed = new Fixed(0,0);
        int result = fixed.reverse(0);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testReverseTailingZero() {
        Fixed fixed = new Fixed(0,0);
        int result = fixed.reverse(10);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testReverseNegative() {
        Fixed fixed = new Fixed(0,0);
        int result = fixed.reverse(-1234);
        Assert.assertEquals(result, -4321);
    }
}