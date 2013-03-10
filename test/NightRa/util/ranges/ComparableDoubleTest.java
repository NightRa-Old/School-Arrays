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
}
