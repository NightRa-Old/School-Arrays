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

    public double getMin() {
        return min.get();
    }

    public double getMax() {
        return max.get();
    }
}
