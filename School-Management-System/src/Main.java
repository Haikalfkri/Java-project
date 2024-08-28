import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher valir = new Teacher(3, "Valir", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(valir);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student alpha = new Student(2, "Alpha", 12);
        Student lilia = new Student(3, "Lilia", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(alpha);
        studentList.add(lilia);

        School ghs = new School(teacherList, studentList);

        tamasha.payFees(5000);
        System.out.println("GHS earned $" + ghs.getTotalMoneyEarned());

        alpha.payFees(20000);
        System.out.println("GHS earned $" + ghs.getTotalMoneyEarned());

        System.out.println("-------Making School Pay Salary-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(alpha);
        System.out.println(lizzy);

    }
}