package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testInstanceVar(){
        //Given
        String expFirstName = "Leon";
        String expLastName = "Hunter";
        Double[] expExamScores = {100.0, 95.0, 123.0, 96.0};
        String expExamScoresAsStr = "Exam Scores:\n\tExam 1 -> 100\n\tExam 2 ->  95\n\tExam 3 -> 123\n\tExam 4 ->  96\n";

        //When
        Student student = new Student(expFirstName, expLastName, expExamScores);
        String actFirstName = student.getFirstName();
        String actLastName = student.getLastName();
        String actExamScores = student.getExamScores();

        //Then
        Assert.assertEquals(expFirstName, actFirstName);
        Assert.assertEquals(expLastName, actLastName);
        Assert.assertEquals(expExamScoresAsStr, actExamScores);
    }

    @Test
    public void testSetFirstName(){
        //Given
        String expFirstName = "Leon";
        String expLastName = "Hunter";
        Double[] expExamScores = {100.0, 95.0, 123.0, 96.0};

        //When
        Student student = new Student(expFirstName, expLastName, expExamScores);
        String actFirstName = student.getFirstName();

        //Then
        Assert.assertEquals(expFirstName, actFirstName);
    }

    @Test
    public void testSetLastName(){
        //Given
        String expFirstName = "Leon";
        String expLastName = "Hunter";
        Double[] expExamScores = {100.0, 95.0, 123.0, 96.0};

        //When
        Student student = new Student(expFirstName, expLastName, expExamScores);
        String actLastName = student.getLastName();

        //Then
        Assert.assertEquals(expLastName, actLastName);
    }

    @Test
    public void testGetNumberOfExamsTaken(){
        //Given
        Integer expNumberOfExamsTaken = 4;
        Double[] expExamScores = {100.0, 95.0, 123.0, 96.0};
        //When
        Student student = new Student("Leon", "Hunter", expExamScores);
        Integer actNumberOfExamsTaken = student.getNumberOfExamsTaken();
        //Then
        Assert.assertEquals(expNumberOfExamsTaken, actNumberOfExamsTaken);

    }

    @Test
    public void testAddExamScore(){
        //Given
        Double expExamScore = 90.0;
        String expOutput = "Exam Scores:\n\tExam 1 ->  90\n";
        //When
        Student student = new Student("Leon", "Hunter", new Double[0]);
        student.addExamScore(expExamScore);
        String actOutput = student.getExamScores();
        //Then
        Assert.assertEquals(expOutput, actOutput);
    }

    @Test
    public void testGetAverageExamScore(){
        //Given
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Double expAverage = (100.0 + 150.0 + 250.0 + 0.0) / 4;
        //When
        Student student = new Student("Leon", "Hunter", examScores);
        Double actAverage = student.getAverageExamScore();
        //Then
        Assert.assertEquals(expAverage, actAverage);
    }

    @Test
    public void testToStringOverride(){
        //Given
        String expFirstName = "Leon";
        String expLastName = "Hunter";
        Double[] expExamScores = {100.0, 150.0, 250.0, 0.0};
        String expStringRep = "Student Name: Leon Hunter\n> Average Score: 125.0\nExam Scores:\n\tExam 1 -> 100\n\tExam 2 -> 150\n\tExam 3 -> 250\n\tExam 4 ->   0\n";
        //When
        Student student = new Student(expFirstName, expLastName, expExamScores);
        String actStringRep = student.toString();
        //Then
        Assert.assertEquals(expStringRep, actStringRep);
    }

}