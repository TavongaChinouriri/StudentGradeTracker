import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Student> studentList = new ArrayList<>();

    public GradeTracker() {
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
            if (student.getID() == ID) {
                System.out.println("Student ID: " + student.getID());
                System.out.println("Name: " + student.getName());
                System.out.println("Scores: " + student.getScores());
                return;
            }
        }
        System.out.println("Student not found with ID: " + ID);
    }
    public void calculateAverageGrade(int studentId) {
        for (Student student : studentList) {
            if (student.getID() == studentId) {
                double averageGrade = student.calculateAverageGrade();
                System.out.println("Student ID: " + student.getID());
                System.out.println("Name: " + student.getName());
                System.out.println("Average Grade: " + averageGrade);
                return;
            }
        }
        System.out.println("Student not found with ID: " + studentId);
    }
}
