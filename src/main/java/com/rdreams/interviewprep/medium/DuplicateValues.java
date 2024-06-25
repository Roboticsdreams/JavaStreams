package com.rdreams.interviewprep.medium;


import java.util.*;
import java.util.stream.Collectors;

public class DuplicateValues {
    public int[] getDuplicateValues(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> duplicates = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();

        for (Integer element : list) {
            if (!set.add(element)) {
                duplicates.add(element);
            }
        }

        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }
}
