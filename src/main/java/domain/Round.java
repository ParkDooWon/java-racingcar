package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *   Round 클래스
 *
 *   @author ParkDooWon
 */
public class Round {
	private static final int GAME_FINISH = 0;
	private static final int REDUCE_ROUND_NUMBER = 1;
	private static final Map<Integer, Round> roundMap = new HashMap<>();

	private final int round;

	static {
		for (int i = 0; i <= 100; i++) {
			roundMap.put(i, new Round(i));
		}
	}

	private Round(int round) {
		this.round = round;
	}

	public static Round of(String inputRound) {
		validateNumber(inputRound);
		int round = Integer.parseInt(inputRound);
		if (roundMap.get(round) == null) {
			roundMap.put(round, new Round(round));
		}
		return roundMap.get(round);
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
		int reduceRound = this.round - REDUCE_ROUND_NUMBER;
		return roundMap.get(reduceRound);
	}
}
