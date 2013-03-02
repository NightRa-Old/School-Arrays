// Created by Ilan Godik
package NightRa.util.numbers;

import java.util.Random;

public class RandomEx {
    private Random rand;

    public RandomEx(){
        this(new Random());
    }

    public RandomEx(Random rand){
        this.rand = rand;
    }

    public int randomBetween(int min, int max){
        return rand.nextInt(max)+min;
    }

    //Getters and setters

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }


}
