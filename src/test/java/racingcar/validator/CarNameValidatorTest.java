package racingcar.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThatCode;

class CarNameValidatorTest {
    @Test
    @DisplayName("이름이 5자를 초과하면 예외가 발생한다")
    void 이름_5자_초과_예외_테스트() {
        // Given (준비)
        String input = "pobi,jun,longname";
        // When & Then (실행 및 검증)
        assertThatThrownBy(() -> CarNameValidator.nameValidate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("이름이 비어있으면(,,) 예외가 발생한다")
    void 이름_공백_예외_테스트() {
        // Given (준비)
        String input = "pobi,,jun";
        // When & Then (실행 및 검증)
        assertThatThrownBy(() -> CarNameValidator.nameValidate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("이름이 공백(' ')이면 예외가 발생한다")
    void 이름_순수_공백_예외_테스트() {
        // Given (준비)
        String input = "pobi, ,jun";
        // When & Then (실행 및 검증)
        assertThatThrownBy(() -> CarNameValidator.nameValidate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("정상적인 이름은 예외가 발생하지 않는다")
    void 정상_이름_테스트() {
        // Given (준비)
        String input = "pobi,jun,woni";
        // When & Then (실행 및 검증)
        assertThatCode(() -> CarNameValidator.nameValidate(input))
                .doesNotThrowAnyException();
    }
}