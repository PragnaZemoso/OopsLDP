package com.zemosotraining.oops;

//Aggregation: Contained obj Teacher can survive without the container obj College
import java.util.ArrayList;
import java.util.List;

class College {
    String collegeName;
    private List<Teacher> teachersList;

    public College(String collegeName, List<Teacher> teachersList) {
        this.collegeName = collegeName;
        this.teachersList = teachersList;
    }

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setTeachersList(List<Teacher> teachersList) {
        this.teachersList = teachersList;
    }
}

class Teacher {

    String teacherName;
    String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[Teacher: " + teacherName + " & Subject: " + subject + " ]";
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Srinu", "C"));
        teachers.add(new Teacher("Amit", "JAVA"));

        College clg = new College("SNIST", teachers); // Aggregation - teachers obj is passed to College class
        // Here Teacher class can exist independently

        List<Teacher> mylist = clg.getTeachersList();
        System.out.println("College " + clg.getCollegeName() + " has the following teachers:");
        for (Teacher i : mylist) {
            System.out.println(i);
        }

    }
}
