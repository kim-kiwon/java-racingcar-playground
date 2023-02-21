package ch2.racing;

public class Car {
    private String name;
    private int pos;

    public Car(String name) {
        valid(name);
        this.name = name;
        this.pos = 1;
    }

    private void valid(String name) {
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

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name + " : ");

        for(int i = 0; i < pos; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}

