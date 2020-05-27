package pva.education.be;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SEBCheckerImplTest {

    @Test
    public void testCalcGreater() {
        Number n1 = 5;
        Number n2 = 3;

        SEBCheckerImpl sebChecker = new SEBCheckerImpl();
        Assert.assertTrue((int) sebChecker.calc(n1, n2) > 0);
    }

    @Test
    public void testCalcSmaller() {
        Number n1 = 5;
        Number n2 = 3;

        SEBCheckerImpl sebChecker = new SEBCheckerImpl();
        Assert.assertTrue((int) sebChecker.calc(n2, n1) < 0);
    }

    @Test
    public void testCalcEqual() {
        Number n1 = 3;
        Number n2 = 3;

        SEBCheckerImpl sebChecker = new SEBCheckerImpl();
        Assert.assertTrue((int) sebChecker.calc(n1, n2) == 0);
    }
}