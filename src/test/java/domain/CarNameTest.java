package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domain.exception.InvalidCarNameException;

/**
 *   class description
 *
 *   @author ParkDooWon
 */
public class CarNameTest {
	@ParameterizedTest
	@ValueSource(strings = {"doogang", "123456", "parkdoowon"})
	void validateNameLengthTest(String name) {
		assertThatThrownBy(() -> new CarName(name))
			.isInstanceOf(InvalidCarNameException.class)
			.hasMessage(InvalidCarNameException.INVALID_CAR_NAME_LENGTH);
	}
}
