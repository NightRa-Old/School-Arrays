// Created by Ilan Godik
package NightRa.util.numbers;

import org.junit.Assert;
import org.junit.Test;

public class IntBaseTest {
    @Test
    public void testModPositiveOutside() throws Exception {
        IntBase base = new IntBase(5);
        Assert.assertEquals(2, base.Mod(7));
    }

    @Test
    public void testModPositiveInside() throws Exception {
        IntBase base = new IntBase(6);
        Assert.assertEquals(3,base.Mod(3));
    }

    @Test
    public void testModNegativeInside() throws Exception {
        IntBase base = new IntBase(4);
        Assert.assertEquals(2,base.Mod(-2));
    }

    @Test
    public void testModNegativeOutside() throws Exception {
        IntBase base = new IntBase(5);
        Assert.assertEquals(4,base.Mod(-6));
    }
}
