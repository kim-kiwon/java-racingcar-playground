package ch2.racing;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    // List<String>을 받아 내부에서 new Car로 직접 생성할 수도 있으나. 의존성이 숨겨진다.
    public Cars(List<Car> cars) {
        valid(cars);
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    private void valid(List<Car> cars) {
        List<String> uniqueCarNames = cars.stream()
            .map(Car::getName)
            .distinct()
            .collect(Collectors.toList());

        if (cars.size() != uniqueCarNames.size()) {
            throw new IllegalArgumentException("Car 이름에는 중복이 없어야합니다.");
        }
    }

    public void printResult() {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public List<Car> findFastest() {
        int maxPos = cars.stream()
            .mapToInt(Car::getPos)
            .max()
            .getAsInt();

        return cars.stream()
            .filter(car -> car.getPos() == maxPos)
            .collect(Collectors.toList());
    }
}
