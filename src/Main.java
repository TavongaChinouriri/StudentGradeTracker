import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeTracker gradeTracker = new GradeTracker();
        int option;
        do {
            System.out.println(":::::::::::::::::::::::WELCOME TO THE STUDENT GRADE TRACKER:::::::::::::::::::::::\n"+
                    "\n                   ::::::::::::CHOOSE YOUR OPTION::::::::::::\n"+
                    "1. Add Student. " +
                    "\n2. Display Student Information. " +
                    "\n3. Calculate Average. " +
                    "\n4. Exit. ");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your option: ");
            option = input.nextInt();
            List<Double> scores = new ArrayList<>();
            switch (option) {
                case 1: {
                    System.out.println("\n---> ADD STUDENT");
                    System.out.print("Enter Student ID: ");
                    int ID = input.nextInt();
                    System.out.print("Enter number of Scores: ");
                    int studentScoresNum = input.nextInt();
                    System.out.print("Enter Student Name: ");
                    String name = input.next();
                    for (int i = 1; i <= studentScoresNum; i++) {
                        System.out.print("Enter Student Scores: ");
                        double score = input.nextDouble();
                        assert false;
                        scores.add(score);
                    }
                    Student student = new Student(ID, name, scores);
                    gradeTracker.addStudent(student);
                    break;
                }
                case 2: {
                    System.out.println("\n---> DISPLAY STUDENT DETAILS");
                    System.out.print("Enter ID of Student: ");
                    gradeTracker.displayStudent(input.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("\n---> CALCULATE AVERAGE");
                    System.out.print("Enter ID of Student: ");
                    gradeTracker.calculateAverageGrade(input.nextInt());
                    break;
                }
            }
        }
        while (!(option == 4));
        System.out.println("::::::::::::::::::::::::::YOU ARE NOW LEAVING THE TRACKER::::::::::::::::::::::::::");
    }
}
