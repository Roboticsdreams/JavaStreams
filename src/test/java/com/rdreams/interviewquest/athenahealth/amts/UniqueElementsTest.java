package com.rdreams.interviewquest.athenahealth.amts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UniqueElementsTest {
    UniqueElements obj = new UniqueElements();

    @Test
    public void getUnqiueElements_TestCase01() {
        int[] arr = new int[] {1,1,1,2,1,2,2,1};
        int[] actualOutput = obj.getUniqueElements(arr);
        int[] expectedOutput = new int[] {1,2};
        assertArrayEquals(actualOutput,expectedOutput);
    }
}
