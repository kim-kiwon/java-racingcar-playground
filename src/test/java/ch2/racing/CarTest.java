package ch2.racing;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void Car_생성시_이름이_5자초과라면_에러가_발생한다() {
        Assertions.assertThatThrownBy(() -> {
            new Car("longname");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void Car_생성시_이름이_빈_문자열이라면_에러가_발생한다() {
        Assertions.assertThatThrownBy(() -> {
            new Car("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void Car는_4이상의_수를_받으면_이동한다() {
        Car car = new Car("test");

        car.moveByNum(4);

        assertThat(car.getPos()).isEqualTo(1);
    }

    @Test
    void Car는_4미만의_수를_받으면_이동하지않는다() {
        Car car = new Car("test");

        car.moveByNum(3);

        assertThat(car.getPos()).isEqualTo(0);
    }


}
