package org.example.stringutils;
import org.example.StringUtility.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {
    @Test
    public void reverseTest(){
        StringUtils u = new StringUtils();
        assertEquals("ykcul",u.reverse("lucky"));
    }

    @Test
    public void palindromeTest(){
        StringUtils s = new StringUtils();
        assertTrue(s.isPalindrome("lul"));

    }
    @Test
    public void toUppercaseTest(){
        StringUtils s = new StringUtils();
        assertEquals("$LUCKY$",s.toUpperCase("$Lucky$"));
    }
}
