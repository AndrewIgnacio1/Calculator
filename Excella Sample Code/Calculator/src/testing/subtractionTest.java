package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subtractionTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		double output = test.subtraction(5, 4);
		assertEquals(1, output);
	}

}
