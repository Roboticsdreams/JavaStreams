package com.rdreams.interviewquest.athenahealth.mts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {
    @Test
    public void testEqualityWithItself() {
        Student obj = new Student();
        assertEquals(obj, obj);
    }

    @Test
    public void testEqualityWithNull() {
        Student obj = new Student();
        assertNotEquals(null, obj);
        assertNotEquals(obj,null);

    }

    @Test
    public void testEqualityWithDifferentClass() {
        Student stdobj = new Student();
        Object obj = new Object();
        assertNotEquals(stdobj, obj);
    }

    @Test
    public void testEqualityWithDifferentId() {
        Student p1 = new Student(1,"student1", 100,0);
        Student p2 = new Student(2,"student1", 100,0);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithDifferentName() {
        Student p1 = new Student(1,"student1", 100,0);
        Student p2 = new Student(1,"student2", 100,0);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithDifferentMarks() {
        Student p1 = new Student(1,"student1", 50,0);
        Student p2 = new Student(1,"student1", 100,0);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithsameValue() {
        Student p1 = new Student(1,"student1", 100,0);
        p1.setRank(1);
        Student p2 = new Student(1,"student1", 100,0);
        p2.setRank(1);
        assertEquals(p1, p2);
    }

    @Test
    public void testEqualityWithNullandDifferentName() {
        Student p1 = new Student(1,null, 100,0);
        Student p2 = new Student(1,"student1", 100,0);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithNullNames() {
        Student p1 = new Student(1,null, 100,0);
        Student p2 = new Student(1,null, 100,0);
        assertEquals(p1, p2);
    }
}
