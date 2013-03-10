// Created by Ilan Godik
package NightRa.util.arrays;

import NightRa.util.arrays.base.Array;
import NightRa.util.arrays.base.IArrayContainer;
import NightRa.util.arrays.base.IArrayManipulator;
import NightRa.util.numbers.IntBase;

import java.util.Arrays;

public class ArrayMorph<T> extends Array<T> implements IArrayManipulator<T> {

    @SafeVarargs
    public ArrayMorph(T... array) {
        super(array);
    }

    public ArrayMorph(IArrayContainer<T> container) {
        super(container);
    }

    public void shift(int shift) {
        int length = length();
        IntBase base = new IntBase(length);
        T[] shifted = Arrays.copyOf(getArray(), length);
        for (int i = 0; i < length; i++) {
            shifted[base.Mod(i + shift)] = get(i);
        }
        setArray(shifted);
    }

    public void shiftLeft() {
        shift(-1);
    }

    public void shiftRight() {
        shift(1);
    }

    public void swap(int index1, int index2) {
        T temp = get(index1);
        set(index1,get(index2));
        set(index2,temp);
    }

    public void swapPairs() {
        int length = length();
        for (int i = 0; i < (length % 2 == 0 ? length : length - 1); i += 2) {
            swap(i, i + 1);
        }
    }

    public void backwards() {
        for (int i = 0; i < length() / 2; i++) {
            swap(i,length()-i-1);
        }
    }
}
