package com.rdreams.interviewquest.athenahealth.amts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {
    StringReverse obj = new StringReverse();

    @Test
    public void getReverseString_Testcase01() {
        String str = "Hello";
        String actualOutput = obj.getReverseString(str);
        String expectedOutput = "olleH";
        assertEquals(actualOutput,expectedOutput);
    }
}
