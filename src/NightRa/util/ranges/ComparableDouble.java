//Created By Ilan Godik
package NightRa.util.ranges;

public abstract class ComparableDouble {
    private double num;

    protected ComparableDouble(double num){
        this.num = num;
    }

    public double get() {
        return num;
    }

    public abstract boolean isBiggerThan(double num);
    public abstract boolean isSmallerThan(double num);
}
