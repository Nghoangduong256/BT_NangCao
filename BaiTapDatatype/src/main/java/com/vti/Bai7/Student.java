package com.vti.Bai7;

public class Student {
    private String name;
    private double score;
    private Grade grade;

    // Constructor
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        this.grade = classify(score);
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    // Classify Methods
    public Grade classify (double score){
        if (score >= 8.5){
            return Grade.EXCELLENT;
        } else if (score >= 7.0) {
            return  Grade.GOOD;
        } else if (score >= 5.0) {
            return Grade.AVERAGE;
        } else {
            return Grade.WEAK;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", grade=" + grade +
                '}';
    }
}
