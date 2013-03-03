// Created by Ilan Godik
package NightRa.util.numbers;

public class IntBase {
    private int base;
    public IntBase(int base) {
        this.base = base;
    }

    public int Mod(int num) {
        if(num<0){
            return base + num % base;
        }else{
            return num % base;
        }
    }

    public int getBase() {
        return base;
    }
}
