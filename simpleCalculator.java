import java.util.Scanner;

/**
 * simpleCalculator
 */
public class simpleCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean next = true;

        while (next) {
            System.out.print("Enter your first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter you second number: ");
            double number2 = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("Choose your operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            double result;

            switch (operator) {
                case "+":
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = number1 -number2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operator");
            }   
        
            System.out.print("Continue? (yes/no): ");
            String cont = scanner.nextLine().toLowerCase();
        
            if (cont.equals("yes")) {
                continue;
            } else {
                break;
            }
        }
        scanner.close();

    }
}