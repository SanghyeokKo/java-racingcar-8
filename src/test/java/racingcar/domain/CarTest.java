package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    @DisplayName("자동차가 생성될 때 이름과 0의 위치를 가져야 한다")
    void 자동차_생성_테스트() {
        // Given (준비)
        String carName = "pobi";
        // When (실행)
        Car car = new Car(carName);
        // Then (검증)
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isEqualTo(0);
    }
    @Test
    @DisplayName("자동차는 랜덤 숫자가 4 이상일 때 전진한다")
    void 자동차_전진_테스트() {
        // Given (준비): "pobi"라는 이름의 차 생성
        Car car = new Car("pobi");
        int forwardNumber = 4; // 4 이상의 숫자 (예: 4)
        // When (실행): 4를 주고 move() 호출
        car.move(forwardNumber);
        // Then (검증): 위치(position)가 1이 되었는지 확인
        assertThat(car.getPosition()).isEqualTo(1);
    }
    @Test
    @DisplayName("자동차는 랜덤 숫자가 3 이하일 때 멈춘다")
    void 자동차_멈춤_테스트() {
        // Given (준비): "woni"라는 이름의 차 생성
        Car car = new Car("woni");
        int stopNumber = 3; // 3 이하의 숫자 (예: 3)
        // When (실행): 3을 주고 move() 호출
        car.move(stopNumber);
        // Then (검증): 위치(position)가 0 그대로인지 확인
        assertThat(car.getPosition()).isEqualTo(0);
    }
}