// Created by Ilan Godik
package NightRa.util.arrays;

import NightRa.util.numbers.IntBase;

import java.util.Arrays;

public class ArrayMorph<T> {
    private T[] array;

    public ArrayMorph(T... array) {
        this.array = array;
    }

    //Make it a wrapper class maybe?
    public T[] shift(int shift) {
        int length = array.length;
        IntBase base = new IntBase(length);
        T[] shifted = Arrays.copyOf(array, length);
        for (int i = 0; i < length; i++) {
            shifted[base.Mod(i + shift)] = array[i];
        }
        return shifted;
    }

    public T[] shiftLeft() {
        return shift(-1);
    }

    public T[] shiftRight() {
        return shift(1);
    }

    public T[] getArray() {
        return array;
    }
}
