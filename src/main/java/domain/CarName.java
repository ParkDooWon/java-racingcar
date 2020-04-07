package domain;

import domain.exception.InvalidCarNameException;

/**
 *   자동차의 이름을 가지는 클래스
 *
 *   @author ParkDooWon
 */
public class CarName {
	private static final int MAX_CAR_NAME_LENGTH = 5;

	private final String name;

	public CarName(String name) {
		validateNameLength(name);
		this.name = name;
	}

	private void validateNameLength(String name) {
		if (name.length() > MAX_CAR_NAME_LENGTH) {
			throw new InvalidCarNameException(InvalidCarNameException.INVALID_CAR_NAME_LENGTH);
		}
	}
}
