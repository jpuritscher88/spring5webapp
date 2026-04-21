package guru.springframework.spring5webapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnaryFunctionsTest {

	@Test
	public void incrementReturnsUnaryFunction() {
		assertEquals(Integer.valueOf(6), UnaryFunctions.increment().apply(5));
	}
}
