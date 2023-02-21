package ch2.racing;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private RandomGenerator randomGenerator;

    public Racing(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public List<Car> play(String input, int time) {
        List<String> carNames = Arrays.asList(splitInput(input));
        Cars cars = createCarsByCarNames(carNames);

        for(int i = 0; i < time; i ++) {
            moveCarByRandom(cars);
            cars.printResult();
        }

        List<Car> winners = cars.findFastest();
        return winners;
    }

    private String[] splitInput(String input) {
        return input.split(",");
    }

    private Cars createCarsByCarNames(List<String> carNames) {
        List carList = carNames.stream()
            .map(Car::new)
            .collect(Collectors.toList());

        return new Cars(carList);
    }

    private void moveCarByRandom(Cars cars) {
        for (Car car : cars.getCars()) {
            car.moveByNum(randomGenerator.getNum());
        }
    }
}
