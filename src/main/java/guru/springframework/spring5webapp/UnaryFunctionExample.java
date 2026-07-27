package guru.springframework.spring5webapp;

import java.util.function.UnaryOperator;

/**
 * Demonstrates how to create a unary function in Java using
 * {@link java.util.function.UnaryOperator}, which is a specialization of
 * {@link java.util.function.Function} for the case where the operand and
 * result are of the same type.
 */
public class UnaryFunctionExample {

    /**
     * Creates a unary function (a {@link UnaryOperator}) from the given lambda
     * or method reference. This is simply a convenience factory method that
     * allows the compiler to infer the generic type when the operator is
     * used as an argument, and gives callers a clear entry point for
     * constructing unary functions.
     *
     * @param operator the operation to apply to the single argument
     * @param <T>       the type of the operand and result of the operator
     * @return the unary function
     */
    public static <T> UnaryOperator<T> createUnaryFunction(UnaryOperator<T> operator) {
        return operator;
    }

    /**
     * A unary function that increments an {@link Integer} by one.
     */
    public static final UnaryOperator<Integer> INCREMENT = createUnaryFunction(value -> value + 1);

    /**
     * A unary function that squares an {@link Integer}.
     */
    public static final UnaryOperator<Integer> SQUARE = createUnaryFunction(value -> value * value);

    public static void main(String[] args) {
        System.out.println("INCREMENT.apply(5) = " + INCREMENT.apply(5));
        System.out.println("SQUARE.apply(5) = " + SQUARE.apply(5));
    }
}
