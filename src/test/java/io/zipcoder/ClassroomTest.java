package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void testClassroomConstructor(){
        //Given
        Classroom classroom = new Classroom();
        Student[] expStudentArr = new Student[30];
        //When
        Student[] actStudentArr = classroom.getStudents();
        //Then
        Assert.assertEquals(expStudentArr, actStudentArr);
    }

    @Test
    public void testGetAverageExamScore(){
        //Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};
        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);
        //When
        double output = classroom.getAverageExamScore();
        //Then
        System.out.println(output);
    }



}
