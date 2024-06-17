package com.rdreams.interviewquest.athenahealth.mts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StudentMarklist {

    public static List<Student> generateRanklist(List<Student> students) {
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .collect(Collectors.toList());

        AtomicInteger rank = new AtomicInteger(1);
        return sortedStudents.stream()
                .peek(student -> student.setRank(rank.getAndIncrement()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 80, 0));
        students.add(new Student(2, "Jane", 90, 0));
        students.add(new Student(3, "Alice", 75, 0));
        students.add(new Student(4, "Bob", 85, 0));

        List<Student> rankedStudents = generateRanklist(students);
        rankedStudents.forEach(System.out::println);
    }
}