import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    private ArrayList<Student> studentList;

    public GradeTracker(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    @Override
    public String toString() {
        return "GradeTracker{" +
                "studentList=" + studentList +
                '}';
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void displayStudent(int ID){
        for (Student student : studentList) {
            if (student.getID() == studentList) {
                System.out.println("Student ID: " + student.getID());
                System.out.println("Name: " + student.getName());
                System.out.println("Scores: " + student.getScores());
                return;
            }
        }
        System.out.println("Student not found with ID: " + ID);
    }
    }
}
