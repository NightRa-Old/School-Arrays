// Created by Ilan Godik
package NightRa.util.ranges;

import org.junit.Assert;
import org.junit.Test;

public class ExclusiveTest {
    @Test
    public void testIsBiggerThan() throws Exception {
        ComparableDouble ex = new Exclusive(7.5);
        Assert.assertFalse(ex.isBiggerThan(7.5));
        Assert.assertTrue(ex.isBiggerThan(6));
        Assert.assertFalse(ex.isBiggerThan(8));
    }

    @Test
    public void testIsSmallerThan() throws Exception {
        ComparableDouble ex = new Exclusive(3.2);
        Assert.assertFalse(ex.isSmallerThan(3.2));
        Assert.assertTrue(ex.isSmallerThan(5));
        Assert.assertFalse(ex.isSmallerThan(1));
    }

    @Test
    public void testEquals() throws Exception {
        ComparableDouble ex = new Exclusive(9);
        ComparableDouble ex1 = new Exclusive(9);
        Assert.assertEquals(ex,ex1);
    }

    @Test
    public void testNotEqualsToInclusive() throws Exception {
        ComparableDouble inc = new Inclusive(8.2);
        ComparableDouble ex = new Exclusive(8.2);
        Assert.assertEquals(false, ex.equals(inc));
    }

    @Test
    public void testNotEqualNumbers() throws Exception {
        ComparableDouble ex = new Exclusive(7);
        ComparableDouble ex1 = new Exclusive(8);
        Assert.assertEquals(false,ex.equals(ex1));

    }
}
