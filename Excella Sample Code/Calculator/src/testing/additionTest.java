package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class additionTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		double output = test.addition(5, 4);
		assertEquals(9, output);
	}

}
