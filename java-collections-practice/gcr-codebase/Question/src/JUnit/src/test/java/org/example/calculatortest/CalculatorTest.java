package JUnit.src.test.java.org.example.calculatortest;

import org.example.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void calculatorTest(){
        Calculator c = new Calculator();


        assertEquals(10.5, c.add(5.2, 5.3), 0.0001);
    }

    @Test
    public void calaultorTestException(){
        Calculator c = new Calculator();
        Exception ex = assertThrows(ArithmeticException.class, () -> {
            c.division(4, 0);
        });
        assertEquals("/ by zero", ex.getMessage());
    }
    @Test
    public void calculatorSubtraction(){
        Calculator c = new Calculator();
        assertEquals(6,c.subtract(12,6),0.0001);
    }
}
