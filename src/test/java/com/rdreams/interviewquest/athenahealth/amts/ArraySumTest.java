package com.rdreams.interviewquest.athenahealth.amts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {
    ArraySum obj = new ArraySum();

    @Test
    public void getArraySum_TestCase01() {
        int[] arr = new int[] {1,2,3,4,5};
        int actualOuput = obj.getArraysum(arr);
        int expectedOutput = 15;
        assertEquals(actualOuput,expectedOutput);
    }
}
