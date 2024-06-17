package com.rdreams.interviewquest.athenahealth.amts;

import java.util.Arrays;

public class UniqueElements {
    public int[] getUniqueElements(int[] arr){
        return Arrays.stream(arr).boxed().distinct().mapToInt(Integer::intValue).toArray();
    }
}
