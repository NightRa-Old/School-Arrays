// Created by Ilan Godik
package NightRa.util.arrays.base;

import NightRa.util.ranges.Range;

import java.util.Arrays;

public class Array<T> implements IArrayContainer<T>{
    protected T[] array;

    @SafeVarargs
    public Array(T... array) {
        this.array = array;
    }

    public Array(IArrayContainer<T> container){
        this.array = container.getArray();
    }

    public void set(int index, T data){
        array[index] = data;
    }

    public T get(int index){
        return array[index];
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int length(){
        return array.length;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof IArrayContainer && Arrays.equals(((IArrayContainer) obj).getArray(),getArray());
    }

    public Range getIndexRange() {
        return new Range(0,length());
    }
}
