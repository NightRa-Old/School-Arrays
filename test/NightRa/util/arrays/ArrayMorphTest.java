// Created by Ilan Godik
package NightRa.util.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMorphTest {
    @Test
    public void testShift() throws Exception {
        ArrayMorph<Integer> array = new ArrayMorph<Integer>(5,3,8,9,2);
        Integer[] expected = {8,9,2,5,3};
        Assert.assertArrayEquals(expected,array.shift(-2));
    }

    @Test
    public void testShiftLeft() throws Exception {
        ArrayMorph<Character> array = new ArrayMorph<Character>('a','b','c','d','e');
        Character[] expected = {'b','c','d','e','a'};
        Assert.assertArrayEquals(expected,array.shiftLeft());
    }

    @Test
    public void testShiftRight() throws Exception {
        ArrayMorph<String> array = new ArrayMorph<String>("Hello","World","How","Are","You?");
        String[] expected = {"You?","Hello","World","How","Are"};
        Assert.assertArrayEquals(expected,array.shiftRight());
    }
}
