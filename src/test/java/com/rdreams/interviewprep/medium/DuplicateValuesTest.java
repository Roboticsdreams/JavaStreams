package com.rdreams.interviewprep.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateValuesTest {
    DuplicateValues obj = new DuplicateValues();

    @Test
    void getDuplicateValues_Testcase01() {
        int[] arr = { 1, 2,3,4,3,2,2,7};
        int[] actualOutput = obj.getDuplicateValues(arr);
        int[] expectedOutput = new int[]{3,2};
        assertArrayEquals(expectedOutput, actualOutput);
    }
}
