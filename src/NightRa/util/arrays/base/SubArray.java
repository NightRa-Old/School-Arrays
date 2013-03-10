// Created by Ilan Godik
package NightRa.util.arrays.base;

import NightRa.util.ranges.Range;

public class SubArray<T> extends Array<T> {
    private int startIndex;
    private int endIndex;

    public SubArray(IArrayContainer<T> container, int startIndex, int endIndex) {
        super(container);
        Range range = new Range(0, length());
        if (!(range.contains(startIndex) && range.contains(endIndex))) {
            throw new IndexOutOfBoundsException();
        }
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public T get(int index) {
        return super.get(startIndex+index);
    }

    @Override
    public void set(int index, T data) {
        super.set(index+startIndex, data);
    }

    @Override
    public int length() {
        return endIndex-startIndex;
    }
}
