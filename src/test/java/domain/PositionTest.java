package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *   class description
 *
 *   @author ParkDooWon
 */
public class PositionTest {
	@Test
	void createEmptyPositionTest() {
		assertThat(Position.zero()).isInstanceOf(Position.class);
	}
}
