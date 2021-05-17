package uaslp.objetos.exams;

import java.util.LinkedList;
import java.util.List;

public class Student {

    private int Code;
    private String Name;
    private int Score;
    private double Average;

    public Student(String Name, int Code) {
        this.Name = Name;
        this.Code = Code;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setScore(int index, int score) {
        Score = score;
    }

    public double getAverage() {
        int suma;

        return Average;

    }

    public void setAverage(double average) {
        Average = average;
    }
}
