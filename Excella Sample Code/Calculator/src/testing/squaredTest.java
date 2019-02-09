package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squaredTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		double output = test.squared(5);
		assertEquals(25, output);
	}

}
