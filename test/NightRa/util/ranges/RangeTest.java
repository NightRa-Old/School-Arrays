// Created by Ilan Godik
package NightRa.util.ranges;

import org.junit.Assert;
import org.junit.Test;

public class RangeTest {
    @Test
    public void testConstructorGet() throws Exception {
        Range range = new Range(5,9);
        Assert.assertEquals(5,range.getMinValue(),0);
        Assert.assertEquals(9,range.getMaxValue(),0);
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

    @Test
    public void testGetMin() throws Exception {
        Range range = new Range(8,9);
        Inclusive inc = new Inclusive(8);
        Exclusive ex = new Exclusive(9);
        Assert.assertEquals(inc,range.getMin());
        Assert.assertEquals(ex,range.getMax());
    }

    @Test
    public void testEquals() throws Exception {
        Range range = new Range(9,7);
        Range range2 = new Range(9,7);
        Assert.assertEquals(range2,range);

    }
}
