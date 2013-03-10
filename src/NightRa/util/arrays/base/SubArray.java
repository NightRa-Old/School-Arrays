// Created by Ilan Godik
package NightRa.util.arrays.base;

import NightRa.util.ranges.Range;

public class SubArray<T> extends Array<T> {
    private int startIndex;
    private int endIndex;

    public SubArray(IArrayContainer<T> container, int startIndex, int endIndex) {
        super(container);
        assertInRange(startIndex, endIndex);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    void assertInRange(int startIndex, int endIndex) {
        Range range = new Range(0, super.length());
        if (!(range.contains(startIndex) && range.contains(endIndex))) {
            throw new IndexOutOfBoundsException();
        }
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

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
}
