package com.rdreams.interviewquest.athenahealth.mts;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StudentMarklist {

    public List<Student> getStudentMarklist(List<Student> students) {
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .collect(Collectors.toList());

        AtomicInteger rank = new AtomicInteger(1);
        return sortedStudents.stream()
                .peek(student -> student.setRank(rank.getAndIncrement()))
                .collect(Collectors.toList());
    }
}