// Created by Ilan Godik
package NightRa.util.arrays.base;

import org.junit.Assert;
import org.junit.Test;

public class SubArrayTest {
    private Array<Integer> array = new Array<>(9,4,7,23,7,5);
    private SubArray<Integer> sub = new SubArray<>(array,1,4);

    @Test
    public void testGetStartIndex() throws Exception {
        Assert.assertEquals(1,sub.getStartIndex());
    }

    @Test
    public void testGetEndIndex() throws Exception {
        Assert.assertEquals(4,sub.getEndIndex());
    }

    @Test
    public void testGet() throws Exception {
        Assert.assertEquals((Integer)7,sub.get(1));
    }

    @Test
    public void testSet() throws Exception {
        sub.set(2,15);
        Assert.assertEquals((Integer)15,sub.get(2));
        Assert.assertEquals((Integer)15,array.get(3));
    }

    @Test
    public void testLength() throws Exception {
        Assert.assertEquals(3,sub.length());
    }
}
