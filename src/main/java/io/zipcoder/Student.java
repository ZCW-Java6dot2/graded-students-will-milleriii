package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    //Defining Construction
    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }


    //Defining Methods
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }



    public String getExamScores(){
        String output = "Exam Scores:\n";
        for (int i = 0; i < examScores.size(); i++){
            output += String.format("\tExam %d -> %3.0f\n", i + 1, examScores.get(i));
        }
        return output;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examList, double examValue){
        examScores.set(examList, examValue);
    }

    public Double getAverageExamScore(){
        Double totalPoints = 0.0;
        for (double i: examScores){
            totalPoints += i;
        }
        return totalPoints / examScores.size();

    }

    @Override
    public String toString(){
        String output = String.format("Student Name: %s %s\n> Average Score: %3.1f\n",getFirstName(), getLastName(), getAverageExamScore()) + getExamScores();
        return output;
    }

}
