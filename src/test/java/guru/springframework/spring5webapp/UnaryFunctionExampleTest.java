package guru.springframework.spring5webapp;

import org.junit.Test;

import java.util.function.UnaryOperator;

import static org.junit.Assert.assertEquals;

public class UnaryFunctionExampleTest {

    @Test
    public void createUnaryFunctionReturnsWorkingOperator() {
        UnaryOperator<String> upperCase = UnaryFunctionExample.createUnaryFunction(String::toUpperCase);

        assertEquals("HELLO", upperCase.apply("hello"));
    }

    @Test
    public void incrementAddsOne() {
        assertEquals(Integer.valueOf(6), UnaryFunctionExample.INCREMENT.apply(5));
    }

    @Test
    public void squareMultipliesValueByItself() {
        assertEquals(Integer.valueOf(25), UnaryFunctionExample.SQUARE.apply(5));
    }
}
