package com.rdreams.interviewprep.leetcode.dsa.arrays101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsectiveOnesTest {
    MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

    @Test
    void findMaxConsecutiveOnes_Testcase01() {
        int[] arr = new int[] {1,0,1,1,1,0,1};
        int actualOutput = obj.findMaxConsecutiveOnes(arr);
        int expectedOutput = 3;
        assertEquals(expectedOutput,actualOutput);
    }
}
