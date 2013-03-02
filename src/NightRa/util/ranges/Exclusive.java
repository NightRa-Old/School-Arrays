// Created by Ilan Godik
package NightRa.util.ranges;

public class Exclusive extends ComparableDouble {
    public Exclusive(double num) {
        super(num);
    }

    @Override
    public boolean isBiggerThan(double num) {
        return get() > num;
    }

    @Override
    public boolean isSmallerThan(double num) {
        return get() < num;
    }
}
