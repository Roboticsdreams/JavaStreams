package com.rdreams.interviewquest.athenahealth.mts;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Student {
    private int id;
    private String name;
    private int marks;
    @Setter
    private int rank;

}
