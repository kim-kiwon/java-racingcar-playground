package ch2;

import ch2.racing.Car;
import ch2.racing.Racing;
import ch2.racing.RandomGenerator;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String input = getCarNames();

        int time = getTime();

        Racing racing = new Racing(new RandomGenerator());
        List<Car> winners = racing.play(input, time);

        printWinner(winners);
    }

    private static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        return input;
    }

    private static int getTime() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        return time;
    }

    private static void printWinner(List<Car> cars) {
        StringBuilder sb = new StringBuilder();

        for(Car car : cars) {
            sb.append(car.getName() + " ");
        }

        sb.append("가 최종 우승했습니다.");

        System.out.println(sb);
    }
}
