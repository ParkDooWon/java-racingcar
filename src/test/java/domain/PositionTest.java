package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

	@DisplayName("move시 Position이 증가하는지 확인")
	@ParameterizedTest
	@CsvSource({"0,1", "99,100", "100, 101"})
	void increasePositionTest(int before, int after) {
		// position은 of로 값을 지정하지않고 무조건 0부터 시작하기 때문에 of가 필요없는데,
		// 제대로 값이 증가했는지를 보기위한 테스트를 위해 of를 만드는 것이 좋은건가?
		Position position = Position.of(before);
		assertThat(position.increase()).isEqualTo(Position.of(after));
	}
}
