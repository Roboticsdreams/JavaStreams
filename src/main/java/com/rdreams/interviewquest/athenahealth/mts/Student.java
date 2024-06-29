package com.rdreams.interviewquest.athenahealth.mts;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int marks;
    private int rank;

    public Student(int id, String name, int marks, int rank) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.rank = rank;
    }

    public Student() {

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getMarks() == student.getMarks() && Objects.equals(getName(), student.getName());
    }

    @Override
    public String toString() {
        return "Student [id="+id +", name=" + name + ", totalmarks=" + marks + ", rank=" + rank + "]";
    }
}
