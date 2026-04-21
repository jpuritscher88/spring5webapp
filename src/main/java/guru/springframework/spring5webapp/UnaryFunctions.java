package guru.springframework.spring5webapp;

import java.util.function.UnaryOperator;

public final class UnaryFunctions {

	private UnaryFunctions() {
	}

	public static UnaryOperator<Integer> increment() {
		return value -> value + 1;
	}
}
