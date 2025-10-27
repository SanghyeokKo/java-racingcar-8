package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.assertj.core.api.Assertions.assertThat;

class NumberGeneratorTest {
    @RepeatedTest(100)  //100번 반복 테스트
    @DisplayName("returnRandomNumber에서 0~9사이의 값을 반환한다")
    void 랜덤_숫자_범위_테스트(){
        //Given(준비)
        NumberGenerator generator = new NumberGenerator();
        //when(실행)
        int randomNumber = generator.returnRandomNumber();
        //Then(검증)
        assertThat(randomNumber).isGreaterThanOrEqualTo(0);
        assertThat(randomNumber).isLessThanOrEqualTo(9);
    }
}
