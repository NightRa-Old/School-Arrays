// Created by Ilan Godik
package NightRa.util.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayBuilderTest {
    @Test
    public void testBuildIntArray() throws Exception {
        int size = 5;
        int[] array = ArrayBuilder.buildIntArray(size);
        Assert.assertEquals(5,array.length);
    }
}
