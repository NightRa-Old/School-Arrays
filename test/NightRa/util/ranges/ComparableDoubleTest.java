// Created by Ilan Godik
package NightRa.util.ranges;

import org.junit.Assert;
import org.junit.Test;

public class ComparableDoubleTest {
    @Test
    public void testGet() throws Exception {
        ComparableDouble comp = new Exclusive(5);
        Assert.assertEquals(5,comp.get(),0);
    }

    @Test
    public void testIsBiggerThanInclusive() throws Exception {
        ComparableDouble inc = new Inclusive(7.5);
        Assert.assertTrue(inc.isBiggerThan(7.5));
        Assert.assertTrue(inc.isBiggerThan(6));
        Assert.assertFalse(inc.isBiggerThan(8));
    }

    @Test
    public void testIsSmallerThanInclusive() throws Exception {
        ComparableDouble inc = new Inclusive(3.2);
        Assert.assertTrue(inc.isSmallerThan(3.2));
        Assert.assertTrue(inc.isSmallerThan(5));
        Assert.assertFalse(inc.isSmallerThan(1));
    }

    @Test
    public void testIsBiggerThanExclusive() throws Exception {
        ComparableDouble ex = new Exclusive(7.5);
        Assert.assertFalse(ex.isBiggerThan(7.5));
        Assert.assertTrue(ex.isBiggerThan(6));
        Assert.assertFalse(ex.isBiggerThan(8));
    }

    @Test
    public void testIsSmallerThanExclusive() throws Exception {
        ComparableDouble ex = new Exclusive(3.2);
        Assert.assertFalse(ex.isSmallerThan(3.2));
        Assert.assertTrue(ex.isSmallerThan(5));
        Assert.assertFalse(ex.isSmallerThan(1));
    }
}
