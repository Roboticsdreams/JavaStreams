package com.rdreams.codingchallenges.geeksforgeeks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquareHollowTest {
    SquareHollow obj = new SquareHollow();

    @Test
    void getSquareHollow_Testcase01() {
        int n = 1;
        List<String> actualOutput = obj.getSquareHollow(n);
        List<String> expectedOutput = new ArrayList<>(List.of("*"));
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }

    @Test
    void getSquareHollow_Testcase02() {
        int n = 2;
        List<String> actualOutput = obj.getSquareHollow(n);
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("**","**"));
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }

    @Test
    void getSquareHollow_Testcase03() {
        int n = 10;
        List<String> actualOutput = obj.getSquareHollow(n);
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("**********", "*        *","*        *","*        *","*        *","*        *","*        *","*        *","*        *","**********"));
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }
}
