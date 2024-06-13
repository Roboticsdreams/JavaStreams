package com.rdreams.interviewquest.coforge;

import java.util.Arrays;
import java.util.Comparator;

public class EvenLongestWord {
    public String getEvenLongestWord(String input) {
        String[] str = input.split(" ");
        return  Arrays.stream(str)
                .map(s -> s.replaceAll("\\W",""))
                .filter(ss -> (ss.length() %2)==0)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
