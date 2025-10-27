package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    @Test
    @DisplayName("생성자 테스트: 이름 리스트로 Car 리스트가 잘 생성된다")
    void 생성자_테스트() {
        // Given (준비)
        List<String> names = List.of("pobi", "woni");
        // When (실행)
        Cars cars = new Cars(names);
        // Then (검증)
        List<Car> carList = cars.getCars();
        assertThat(carList).hasSize(2); // 차가 2대인가?
        assertThat(carList.get(0).getName()).isEqualTo("pobi"); // 0번째 차 이름이 pobi인가?
        assertThat(carList.get(1).getName()).isEqualTo("woni"); // 1번째 차 이름이 woni인가?
    }
    @Test
    @DisplayName("findWinners 테스트: pobi가 단독 우승한다")
    void 단독_우승자_테스트() {
        // Given (준비)
        Cars cars = new Cars(List.of("pobi", "woni", "jun"));
        // When (실행):
        List<Car> carList = cars.getCars();
        carList.get(0).move(4); // pobi 1칸 전진
        carList.get(0).move(4); // pobi 2칸 전진
        carList.get(1).move(3); // woni 멈춤
        carList.get(2).move(4); // jun 1칸 전진
        // (현재 상태: pobi=2, woni=0, jun=1)
        // Then (검증):
        List<String> winners = cars.findWinners();
        // "pobi"만 포함하고, 크기는 1이어야 함
        assertThat(winners).containsExactly("pobi");
    }
    @Test
    @DisplayName("findWinners 테스트: pobi와 jun이 공동 우승한다")
    void 공동_우승자_테스트() {
        // Given (준비)
        Cars cars = new Cars(List.of("pobi", "woni", "jun"));
        // When (실행): pobi와 jun이 2칸으로 동일하게 만듦
        List<Car> carList = cars.getCars();
        carList.get(0).move(4); // pobi 1
        carList.get(0).move(4); // pobi 2
        carList.get(1).move(3); // woni 0
        carList.get(2).move(4); // jun 1
        carList.get(2).move(4); // jun 2
        // (현재 상태: pobi=2, woni=0, jun=2)
        // Then (검증):
        List<String> winners = cars.findWinners();
        // "pobi"와 "jun"을 포함해야 함 (순서도 중요)
        assertThat(winners).containsExactly("pobi", "jun");
    }
}