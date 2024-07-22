public class Driver
{
    public static void main(String[] args) 
    {
        Student alex = new Student("alex");
        alex.add("Mathematics", 'C');
        alex.add("English", 'A');
        alex.add("History", 'B');
        alex.add("Geography", 'D');

        System.out.println(alex.getName() + " has a GPA of " + alex.getGPA());
        System.out.println("It is obtained from these subjects");
        
        for (String str: alex.getSubjects()) {
            System.out.println(str);
        }

    }
}