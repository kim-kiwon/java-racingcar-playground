package ch2.racing;

public class Car {
    private String name;
    private int pos;

    public Car(String name) {
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Car 이름은 null일 수 없습니다.");
        }

        if (name == "") {
            throw new IllegalArgumentException("Car 이름은 빈 문자열일 수 없습니다.");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("Car 이름은 5자 초과일 수 없습니다.");
        }
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

