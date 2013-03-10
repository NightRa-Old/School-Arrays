// Created by Ilan Godik
package NightRa.util.ranges;

public class Range {
    private ComparableDouble min;
    private ComparableDouble max;

    public Range(ComparableDouble min, ComparableDouble max) {
        this.min = min;
        this.max = max;
    }

    public Range(double min, double max){
        this.min = new Inclusive(min);
        this.max = new Exclusive(max);
    }

    public boolean contains(double num){
        return min.isSmallerThan(num) && max.isBiggerThan(num);
    }

    public double getMinValue() {
        return min.get();
    }

    public double getMaxValue() {
        return max.get();
    }

    public ComparableDouble getMin() {
        return min;
    }


    public ComparableDouble getMax() {
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Range range = (Range) o;

        if (!max.equals(range.max)) return false;
        if (!min.equals(range.min)) return false;

        return true;
    }
}
