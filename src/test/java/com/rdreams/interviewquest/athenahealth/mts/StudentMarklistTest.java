package com.rdreams.interviewquest.athenahealth.mts;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentMarklistTest {
    StudentMarklist obj = new StudentMarklist();
    static List<Student> students = new ArrayList<>();

    @BeforeAll
    public static void updateStudentList() {
        students.add(new Student(1, "John", 80, 0));
        students.add(new Student(2, "Jane", 90, 0));
        students.add(new Student(3, "Alice", 90, 0));
        students.add(new Student(4, "Bob", 85, 0));
    }

    @Test
    public void getStudentMarklist_TestCase01() {
        List<Student> actualOutput = obj.getStudentMarklist(students);
        List<Student> expectedOutput = new ArrayList<>();
        expectedOutput.add(new Student(2, "Jane", 90, 1));
        expectedOutput.add(new Student(3, "Alice", 90, 2));
        expectedOutput.add(new Student(4, "Bob", 85, 3));
        expectedOutput.add(new Student(1, "John", 80, 4));
        assertArrayEquals(actualOutput.toArray(),expectedOutput.toArray());
    }
}
