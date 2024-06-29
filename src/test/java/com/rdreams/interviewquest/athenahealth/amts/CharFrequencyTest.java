package com.rdreams.interviewquest.athenahealth.amts;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharFrequencyTest {
    CharFrequency obj = new CharFrequency();

    @Test
    public void getCharacterFrequency_Testcase01() {
        String input = "Hello";
        Map<Character,Long> actualOutput = obj.getCharacterFrequency(input);
        Map<Character, Long> expectedOutput = new HashMap<>();
        expectedOutput.put('H',1L);
        expectedOutput.put('e',1L);
        expectedOutput.put('l',2L);
        expectedOutput.put('o',1L);
        assertEquals(actualOutput,expectedOutput);
    }
}
