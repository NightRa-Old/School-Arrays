// Created by Ilan Godik
package NightRa.util.containers;

public class DoubleContainer implements IContainer {
    private double num;

    public DoubleContainer(double num){
        this.num = num;
    }

    public double get() {
        return num;
    }
}
