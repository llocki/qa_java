package com.example;
import java.util.List;

public class Lion {

    private Predator predator;
    boolean hasMane;


    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
            this.predator = feline;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
            this.predator = feline;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Feline feline){
        this.predator = feline;
    }


    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
