package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *   class description
 *
 *   @author ParkDooWon
 */
public class RoundTest {
	@DisplayName("round가 정수가 아닌 경우 예외 발생")
	@ParameterizedTest
	@ValueSource(strings = {"a", "1ka", "1d2"})
	void validateRoundTest(String round) {
		assertThatThrownBy(() -> Round.of(round))
			.isInstanceOf(NumberFormatException.class);
	}
}
