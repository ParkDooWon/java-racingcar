package domain;

/**
 *   Round 클래스
 *
 *   @author ParkDooWon
 */
public class Round {
	int round;

	public static Round of(String round) {
		validateNumber(round);
		return new Round();
	}

	private static void validateNumber(String round) {
		Integer.parseInt(round);
	}
}
