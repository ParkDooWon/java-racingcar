package domain;

/**
 *   Round에 대한 커스텀 예외
 *
 *   @author ParkDooWon
 */
public class InvalidRoundException extends IllegalArgumentException {
	public static final String INVALID_ROUND = "라운드는 정수로 입력해야 합니다.";

	public InvalidRoundException(String message) {
		super(message);
	}
}
