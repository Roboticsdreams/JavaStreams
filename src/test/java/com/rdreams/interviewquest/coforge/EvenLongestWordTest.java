package com.rdreams.interviewquest.coforge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenLongestWordTest {
    EvenLongestWord obj = new EvenLongestWord();

    @Test
    void getEvenLongestWord_Testcase01() {
        String str = "Good Morning!  Hello world";
        String actualOutput = obj.getEvenLongestWord(str);
        String expectedOutput = "Good";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void getEvenLongestWord_Testcase02() {
        String str = "Goods Morning! Hello world";
        String actualOutput = obj.getEvenLongestWord(str);
        String expectedOutput = "";
        assertEquals(expectedOutput, actualOutput);
    }
}
