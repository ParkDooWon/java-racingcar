package domain.exception;

/**
 *   class description
 *
 *   @author ParkDooWon
 */
public class InvalidCarNameException extends IllegalArgumentException {
	public static final String INVALID_CAR_NAME_LENGTH = "자동차 이름은 5자이하여야 합니다.";

	public InvalidCarNameException(String message) {
		super(message);
	}
}
