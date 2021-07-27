package com.platzi.javatest.util;

import org.junit.Test;

import static com.platzi.javatest.util.PasswordUtil.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(SecurityLevel.WEAK, assessPassword("123aa!"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(SecurityLevel.WEAK, assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_number() {
        assertEquals(SecurityLevel.MEDIUM, assessPassword("abcd1234"));
    }
    @Test
    public void medium_when_has_letters_and_number_symbols() {
        assertEquals(SecurityLevel.STRONG, assessPassword("abcd1234!"));
    }

}