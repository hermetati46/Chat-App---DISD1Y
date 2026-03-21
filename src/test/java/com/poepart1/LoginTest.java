package com.poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    Login login = new Login();

    @Test
    public void testUsernameCorrect() {
        // Test Data: "kyl_1" (contains underscore, <= 5 chars)
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testUsernameIncorrect() {
        assertFalse(login.checkUserName("kyle!!!!!!"));
    }

    @Test
    public void testPasswordComplexitySuccess() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordComplexityFailure() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testPhoneNumberCorrect() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testPhoneNumberIncorrect() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }
}