package com.rdreams.codingchallenges.geeksforgeeks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareFill {
    public List<String> getSquareFill(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> {
                    StringBuilder line = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        line.append("*");
                    }
                    return line.toString();
                }).collect(Collectors.toList());
    }
}
