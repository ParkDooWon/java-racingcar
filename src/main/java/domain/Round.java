package domain;

/**
 *   Round 클래스
 *
 *   @author ParkDooWon
 */
public class Round {
	private static final int GAME_FINISH = 0;
	final int round;

	public Round(int round) {
		this.round = round;
	}

	public static Round of(String round) {
		validateNumber(round);
		return new Round(Integer.parseInt(round));
	}

	private static void validateNumber(String round) {
		try {
			Integer.parseInt(round);
		} catch (NumberFormatException e) {
			throw new InvalidRoundException(InvalidRoundException.INVALID_ROUND);
		}
	}

	public boolean isInProgress() {
		return this.round > GAME_FINISH;
	}
}
