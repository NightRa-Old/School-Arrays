// Created by Ilan Godik
package NightRa.util.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMorphTest {
    @Test
    public void testShift() throws Exception {
        ArrayMorph<Integer> array = new ArrayMorph<>(5,3,8,9,2);
        Integer[] expected = {8,9,2,5,3};
        array.shift(-2);
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testShiftLeft() throws Exception {
        ArrayMorph<Character> array = new ArrayMorph<>('a','b','c','d','e');
        Character[] expected = {'b','c','d','e','a'};
        array.shiftLeft();
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testShiftRight() throws Exception {
        ArrayMorph<String> array = new ArrayMorph<>("Hello","World","How","Are","You?");
        String[] expected = {"You?","Hello","World","How","Are"};
        array.shiftRight();
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testSwap() throws Exception {
        ArrayMorph<Integer> array = new ArrayMorph<>(5,3,8,9,5);
        array.swap(1,3);
        Integer[] expected = {5,9,8,3,5};
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testSwapPairsOdd() throws Exception {
        ArrayMorph<Integer> array = new ArrayMorph<>(5,3,8,9,5);
        array.swapPairs();

        Integer[] expected = {3,5,9,8,5};
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testSwapPairsEven() throws Exception {
        ArrayMorph<Integer> array = new ArrayMorph<>(13,5,36,13);
        array.swapPairs();

        Integer[] expected = {5,13,13,36};
        Assert.assertArrayEquals(expected,array.getArray());
    }

    @Test
    public void testBackwards() throws Exception {
        ArrayMorph<Integer> array = new ArrayMorph<>(1,2,3,4,5,6);
        array.backwards();

        Integer[] expected = {6,5,4,3,2,1};
        Assert.assertArrayEquals(expected,array.getArray());
    }
}
