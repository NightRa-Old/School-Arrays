// Created by Ilan Godik
package NightRa.util.ranges;

import org.junit.Assert;
import org.junit.Test;

public class InclusiveTest {
    @Test
    public void testIsBiggerThan() throws Exception {
        ComparableDouble inc = new Inclusive(7.5);
        Assert.assertTrue(inc.isBiggerThan(7.5));
        Assert.assertTrue(inc.isBiggerThan(6));
        Assert.assertFalse(inc.isBiggerThan(8));
    }

    @Test
    public void testIsSmallerThan() throws Exception {
        ComparableDouble inc = new Inclusive(3.2);
        Assert.assertTrue(inc.isSmallerThan(3.2));
        Assert.assertTrue(inc.isSmallerThan(5));
        Assert.assertFalse(inc.isSmallerThan(1));
    }
}
