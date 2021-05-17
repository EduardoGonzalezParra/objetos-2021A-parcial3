package uaslp.objetos.exams;

import java.util.LinkedList;
import java.util.List;

public class Group {

    private List<Student> Students;
    private int Capacity;
    private int Availability;
    private double Average;

    public Group(int Capacity) {
        this.Capacity = Capacity;
        Students = new LinkedList<>();
    }


    public List<Student> getStudents() {
        return Students;
    }

    public int getCapacity() {
        return Capacity;
    }

    public int getAvailability() {
        Availability = Capacity - Students.size();
        return Availability;
    }

    public void addStudent(Student student) {
        if(getAvailability() == 0) {
            throw new GroupIsFullException();
        }
        Students.add(student);
    }

    public double getAverage(){

        double sum = 0.0;
        for(int i=0; i<Students.size(); i++){
            sum = Students.get(i).getAverage();
        }

        Average = sum / Students.size();

        return Average;
    }

}
