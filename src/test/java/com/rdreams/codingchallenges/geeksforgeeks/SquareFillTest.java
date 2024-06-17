package com.rdreams.codingchallenges.geeksforgeeks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquareFillTest {
    SquareFill obj = new SquareFill();

    @Test
    void getSquareFill_Testcase01() {
        int n = 1;
        List<String> actualOutput = obj.getSquareFill(n);
        List<String> expectedOutput = new ArrayList<>(List.of("*"));
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }

    @Test
    void getSquareFill_Testcase02() {
        int n = 2;
        List<String> actualOutput = obj.getSquareFill(n);
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("**","**"));
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }
}
