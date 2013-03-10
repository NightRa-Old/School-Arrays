//Created By Ilan Godik
package NightRa.util.ranges;

import NightRa.util.containers.DoubleContainer;

public abstract class ComparableDouble extends DoubleContainer {
    public ComparableDouble(double num) {
        super(num);
    }

    public abstract boolean isBiggerThan(double num);
    public abstract boolean isSmallerThan(double num);
    @Override public abstract boolean equals(Object o);
}
