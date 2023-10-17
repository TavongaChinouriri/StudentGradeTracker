import java.util.List;

public class Student {
    private int ID;
    private String name;
    private List<Double> Scores;

    public Student(int ID, String name, List<Double> scores) {
        this.ID = ID;
        this.name = name;
        Scores = scores;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getScores() {
        return Scores;
    }

    public void setScores(List<Double> scores) {
        Scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", Scores=" + Scores +
                '}';
    }
    public double calculateAverageGrade(){
        int sum = 0;
        for (double scores : Scores) {
            sum += scores;
        }
        int divider = Scores.size();
        double average = sum/divider;
        System.out.println("Your average for the scores for student "+ID+" is "+average);
        return average;
    }
}

