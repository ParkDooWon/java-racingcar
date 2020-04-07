package domain;

/**
 *   Round 클래스
 *
 *   @author ParkDooWon
 */
public class Round {
	int round;

	public Round(int round) {
		this.round = round;
	}

	public static Round of(String round) {
		validateNumber(round);
		return new Round(Integer.parseInt(round));
	}

	private static void validateNumber(String round) {
		Integer.parseInt(round);
	}
}
