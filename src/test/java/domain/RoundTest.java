package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.omg.CORBA.DynAnyPackage.Invalid;

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
			.isInstanceOf(InvalidRoundException.class)
			.hasMessage(InvalidRoundException.INVALID_ROUND);
	}

	@Test
	void constructor_createRoundTest() {
		assertThat(Round.of("1")).isInstanceOf(Round.class);
	}

	@ParameterizedTest
	@CsvSource({"0, false", "1, true", "10, true"})
	void isInProgressTest(String round, boolean expected) {
		assertThat(Round.of(round).isInProgress()).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource({"1,0", "5,4", "11,10", "100,99"})
	void reduceRoundTest(String beforeRound, String afterRound) {
		Round round = Round.of(beforeRound);
		assertThat(round.reduceRound()).isEqualTo(Round.of(afterRound));
	}
}
