package domain;

import java.util.Objects;

/**
 *   Round 클래스
 *
 *   @author ParkDooWon
 */
public class Round {
	private static final int GAME_FINISH = 0;
	private final int round;

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

	public Round reduceRound() {
		int reduceRound = this.round - 1;
		return new Round(reduceRound);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Round round1 = (Round)o;
		return round == round1.round;
	}

	@Override
	public int hashCode() {
		return Objects.hash(round);
	}
}
