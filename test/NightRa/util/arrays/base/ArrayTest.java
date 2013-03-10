// Created by Ilan Godik
package NightRa.util.arrays.base;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    private Array<Integer> array = new Array<>(5,3,16,26,4);

    @Test
    public void testSet() throws Exception {
        array.set(1,9);
        Array<Integer> expected = new Array<>(5,9,16,26,4);
        Assert.assertEquals(expected,array);
    }

    @Test
    public void testGet() throws Exception {
        Assert.assertEquals((Integer)16,array.get(2));
    }

    @Test
    public void testGetArray() throws Exception {
        Integer[] expected = {5,3,16,26,4};
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testSetArray() throws Exception {
        array.setArray(new Integer[]{8,13,5});
        Assert.assertArrayEquals(new Integer[]{8,13,5},array.getArray());
    }

    @Test
    public void testEquals() throws Exception {
        Array<Integer> array1 = new Array<>(5,3,16,26,4);
        Assert.assertEquals(true,array.equals(array1));
    }
}
