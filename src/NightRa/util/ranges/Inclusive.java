// Created by Ilan Godik
package NightRa.util.ranges;

public class Inclusive extends ComparableDouble {
    public Inclusive(double num) {
        super(num);
    }

    @Override
    public boolean isBiggerThan(double num) {
        return get() >= num;
    }

    @Override
    public boolean isSmallerThan(double num) {
        return get() <= num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inclusive that = (Inclusive) o;

        return that.get() == get();
    }
}
