// Created by Ilan Godik
package NightRa.util.arrays;

import NightRa.util.numbers.IntBase;

import java.util.Arrays;

public class ArrayMorph<T> {
    private T[] array;

    @SafeVarargs
    public ArrayMorph(T... array) {
        this.array = array;
    }

    public T[] shift(int shift) {
        int length = array.length;
        IntBase base = new IntBase(length);
        T[] shifted = Arrays.copyOf(array, length);
        for (int i = 0; i < length; i++) {
            shifted[base.Mod(i + shift)] = array[i];
        }
        setArray(shifted);
        return shifted;
    }

    public T[] shiftLeft() {
        return shift(-1);
    }

    public T[] shiftRight() {
        return shift(1);
    }

    public T[] swap(int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] swapPairs() {
        int length = array.length;
        for (int i = 0; i < (length % 2 == 0 ? length : length - 1); i += 2) {
            swap(i, i + 1);
        }
        return array;
    }

    public T[] backwards() {
        for (int i = 0; i < array.length / 2; i++) {
            swap(i,array.length-i);
        }
        return array;
    }
}
