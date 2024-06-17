package com.rdreams.interviewquest.athenahealth.amts;

import java.util.Arrays;

public class ArraySum {
    public int getArraysum(int[] arr) {
        return Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();
    }
}
