package ch2.racing;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void 자동차_이름이_유일하지_않다면_Cars_생성시_에러가_발생한다() {
        Car car1 = new Car("test1");
        Car car2 = new Car("test1");
        Car car3 = new Car("test3");

        assertThatThrownBy(() -> {
            new Cars(Arrays.asList(car1, car2, car3));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름이_유일하다면_Cars가_정상_생성된다() {
        Car car1 = new Car("test1");
        Car car2 = new Car("test2");
        Car car3 = new Car("test");

        Cars cars = new Cars(Arrays.asList(car1, car2, car3));
    }
}