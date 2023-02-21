package ch2.racing;

public class Car {
    private String name;
    private int pos;

    public Car(String name) {
        this.name = name;
    }

    public int getPos() {
        return this.pos;
    }

    public void moveByNum(int num) {
        if (canMove(num)) {
            this.pos++;
        }
    }

    private boolean canMove(int num) {
        return num >= 4;
    }
}

