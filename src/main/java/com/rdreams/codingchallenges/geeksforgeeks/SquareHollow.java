package com.rdreams.codingchallenges.geeksforgeeks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareHollow {
    public List<String> getSquareHollow(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> {
                    StringBuilder line = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                            line.append("*");
                        } else {
                            line.append(" ");
                        }
                    }
                    return line.toString();
                })
                .collect(Collectors.toList());
    }
}
