package org.example.ExceptionHandler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZeroDivisionTest {
    ZeroDivision z;
    @Before
    public void setup(){
        z = new ZeroDivision();
    }
    @Test
    public void exception(){
        Exception e = Assert.assertThrows(ArithmeticException.class,()->{
            z.division(1,0);
        });
        assertEquals("/ by zero",e.getMessage());
    }
    @Test
    public void normal(){
        assertEquals(4,z.division(20,5));
    }
}
