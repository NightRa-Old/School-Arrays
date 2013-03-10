// Created by Ilan Godik
package NightRa.util.ranges;

import org.junit.Assert;
import org.junit.Test;

public class RangeTest {
    @Test
    public void testConstructorGet() throws Exception {
        Range range = new Range(5,9);
        Assert.assertEquals(5,range.getMin(),0);
        Assert.assertEquals(9,range.getMax(),0);
    }

    @Test
    public void testContainsIE() throws Exception {
        Range range = new Range(7.2,10);
        Assert.assertTrue(range.contains(7.2));
        Assert.assertTrue(range.contains(9));
        Assert.assertFalse(range.contains(10));
    }

    @Test
    public void testThrowOutOfBounds() throws Exception {
        Range range = new Range(0,6);
        Assert.assertEquals(true,range.contains(5));

    }
}
