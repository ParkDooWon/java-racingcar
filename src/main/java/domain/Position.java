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
}
