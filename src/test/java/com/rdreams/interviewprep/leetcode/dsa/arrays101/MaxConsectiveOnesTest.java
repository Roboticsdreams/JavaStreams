package com.rdreams.interviewprep.leetcode.dsa.arrays101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsectiveOnesTest {
    MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

    @Test
    public void findMaxConsecutiveOnes_TestCase_01() {
        int[] nums = new int[0];
        int expectedOutput = 0;
        int actualOutput = obj.findMaxConsecutiveOnes(nums);
        assertEquals(expectedOutput, actualOutput) ;
    }

    @Test
    public void findMaxConsecutiveOnes_TestCase_02() {
        int[] nums = {0, 0, 0};
        int expectedOutput = 0;
        int actualOutput = obj.findMaxConsecutiveOnes(nums);
        assertEquals(expectedOutput, actualOutput) ;
    }

    @Test
    public void findMaxConsecutiveOnes_TestCase_03() {
        int[] nums = {1, 1, 1};
        int expectedOutput = 3;
        int actualOutput = obj.findMaxConsecutiveOnes(nums);
        assertEquals(expectedOutput, actualOutput) ;
    }

    @Test
    public void findMaxConsecutiveOnes_TestCase_04() {
        int[] nums = {0, 1, 0};
        int expectedOutput = 1;
        int actualOutput = obj.findMaxConsecutiveOnes(nums);
        assertEquals(expectedOutput, actualOutput) ;
    }

    @Test
    public void findMaxConsecutiveOnes_TestCase_05() {
        int[] nums = {1, 1, 0, 1, 1};
        int expectedOutput = 2;
        int actualOutput = obj.findMaxConsecutiveOnes(nums);
        assertEquals(expectedOutput, actualOutput) ;
    }

    @Test
    public void findMaxConsecutiveOnes_TestCase_06() {
        int[] nums = {0, 1, 0, 0, 1};
        int expectedOutput = 1;
        int actualOutput = obj.findMaxConsecutiveOnes(nums);
        assertEquals(expectedOutput, actualOutput) ;
    }
}
