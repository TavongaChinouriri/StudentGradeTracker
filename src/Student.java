import java.util.List;

public class Student {
    private int ID;
    private String name;
    private List<Integer> Scores;

    public Student(int ID, String name, List<Integer> scores) {
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

    public List<Integer> getScores() {
        return Scores;
    }

    public void setScores(List<Integer> scores) {
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
    public void calculateAverageGrade(){
        int sum = 0;
        for (int scores : Scores) {
            sum += scores;
        }
        int divider = Scores.size();
        double average = sum/divider;
        System.out.println("Your average for the scores for student "+ID+" is "+average);
        if(average<=45){
            System.out.println("Grade D");
            }
        else if (average>45 && average<=59) {
            System.out.println("Grade C");
            }
        else if (average>59 && average<=78) {
            System.out.println("Grade B");
        }
        else if (average>78 && average<=100) {
            System.out.println("Grade A");
        }
        else {
            System.out.println("ERR: Invalid Average");
        }

    }
}

