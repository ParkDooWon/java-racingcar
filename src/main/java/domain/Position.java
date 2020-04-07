package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *   자동차의 위치를 가지는 클래스
 *
 *   @author ParkDooWon
 */
public class Position {
	private static final Map<Integer, Position> cachePosition = new HashMap<>();
	private static final int INCREASE_POSITION_NUMBER = 1;

	static {
		for (int i = 0; i <= 100; i++) {
			cachePosition.put(i, new Position(i));
		}
	}

	private final int position;

	private Position(int position) {
		this.position = position;
	}

	public static Position zero() {
		return cachePosition.get(0);
	}

	public static Position of(int position) {
		return cachePosition.get(position);
	}

	public Position increase() {
		int increasedPosition = this.position + INCREASE_POSITION_NUMBER;
		if (cachePosition.get(increasedPosition) == null) {
			cachePosition.put(increasedPosition, new Position(increasedPosition));
		}
		return cachePosition.get(increasedPosition);
	}
}
