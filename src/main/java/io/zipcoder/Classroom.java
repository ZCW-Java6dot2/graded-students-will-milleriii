package io.zipcoder;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] student){
        students = student;
    }
    public Classroom(){
        students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double totalScore = 0.00;
        for (int i = 0; i < students.length; i++){
            totalScore += students[i].getAverageExamScore();
        }
        return totalScore / students.length;
    }

    //pick up with addStudent method after Exam 2
}
