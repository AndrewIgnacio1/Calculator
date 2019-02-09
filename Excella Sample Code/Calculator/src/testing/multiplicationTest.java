package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplicationTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		double output = test.multiplication(5, 4);
		assertEquals(20, output);
	}

}
