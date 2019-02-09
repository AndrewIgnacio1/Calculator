package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divisionTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		double output = test.division(20, 4);
		assertEquals(5, output);
	}

}
