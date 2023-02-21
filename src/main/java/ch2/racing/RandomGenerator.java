package ch2.racing;

import java.util.Random;

public class RandomGenerator {

    public RandomGenerator() {
    }

    public int getNum() {
        return new Random().nextInt(9);
    }
}
