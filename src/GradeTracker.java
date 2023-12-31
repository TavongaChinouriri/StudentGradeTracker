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
                String grade = "";
                if(averageGrade<=45){
                    grade = "D";
                }
                else if (averageGrade>45 && averageGrade<=59) {
                    grade = "C";
                }
                else if (averageGrade>59 && averageGrade<=78) {
                    grade = "B";
                }
                else if (averageGrade>78 && averageGrade<=100) {
                    grade = "A";
                }
                else {
                    grade = "ERR: Invalid Average";
                }
                System.out.println("Average Grade: " + averageGrade + "\nLetter Grade: "+grade);
                return;
            }
        }
        System.out.println("Student not found with ID: " + studentId);
    }
}
