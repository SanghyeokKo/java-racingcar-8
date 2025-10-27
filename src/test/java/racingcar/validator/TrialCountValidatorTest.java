package racingcar.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThatCode;

class TrialCountValidatorTest {
    @Test
    @DisplayName("시도 횟수가 숫자가 아니면 오류 발생한다.")
    void 횟수가_숫자가_아닌_경우_테스트() {
        // Given (준비)
        String input = "five";
        // When & Then (실행 및 검증)
        assertThatThrownBy(() -> TrialCountValidator.countValidator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("시도 횟수가 0이면 오류 발생한다.")
    void 횟수가_0인_경우_테스트() {
        // Given (준비)
        String input = "0";
        // When & Then (실행 및 검증)
        assertThatThrownBy(() -> TrialCountValidator.countValidator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("시도 횟수가 음수면 오류 발생한다.")
    void 횟수가_음수인_경우_테스트() {
        // Given (준비)
        String input = "-5";
        // When & Then (실행 및 검증)
        assertThatThrownBy(() -> TrialCountValidator.countValidator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("시도 횟수가 양수이면 오류가 발생하지 않는다.")
    void 횟수가_양수인_경우_테스트(){
        //Given(준비)
        String input = "5";
        //When & Then (실행 및 검증)
        assertThatCode(() -> TrialCountValidator.countValidator(input))
                .doesNotThrowAnyException();
    }
}