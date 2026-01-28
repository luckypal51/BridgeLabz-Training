package org.example.parametarized;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenTest {
    Even e;
    @BeforeEach
    public void setup(){
         e= new Even();
    }


    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 678})
    public void isEven(int number) {
        assertTrue(e.isEven(number));
    }
}
