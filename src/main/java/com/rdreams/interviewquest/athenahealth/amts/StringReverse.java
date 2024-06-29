package com.rdreams.interviewquest.athenahealth.amts;

import java.util.stream.Collectors;

public class StringReverse {
    public String getReverseString(String str) {
        return new StringBuilder(str)
                .reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
