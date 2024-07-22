import java.util.ArrayList;

public class Student
{
    private String name;
    private ArrayList<String> subject;
    private ArrayList<Character> grade;

    public Student(String n) {
        name = n;
        subject = new ArrayList<>();
        grade = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(String s, Character g) {
        subject.add(s);
        grade.add(g);
    }

    public ArrayList<String> getSubjects() {
        return subject;
    }

    public double getGPA() {
        double totalPoint = 0.0;

        for (char g : grade) {
            switch (g) {
                case 'A' -> totalPoint += 4.0;
                case 'B' -> totalPoint += 3.0;
                case 'C' -> totalPoint += 2.0;
                case 'D' -> totalPoint += 1.0;
                case 'E' -> totalPoint += 0.0;
                default -> throw new AssertionError();
            }
        }

        return totalPoint / grade.size();
    }
}