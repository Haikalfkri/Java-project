import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



class TotalAmount
{
    public int total(List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }

        return sum;
    }
}

public class orderFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listMenu = new ArrayList<>();
        int result;
        boolean order = true;

        System.out.println("""
                    1. ikan bakar 26.000
                    2. ikan cabe hitam 23.000
                    3. chicken 20.000  
                """);
        
        while (order) {
            System.out.print("Select a Menu (1, 2, 3): ");
            int menu = scanner.nextInt();

            System.out.print("Amount: ");
            int amount = scanner.nextInt();

            if (menu == 1) {
                result = amount * 26000;
                listMenu.add(result);
            } else if (menu == 2) {
                result = amount * 23000;
                listMenu.add(result);
            } else if (menu == 3) {
                result = amount * 20000;
                listMenu.add(result);
            } else {
                System.out.println("Failed to order. Please try again!");
                continue;
            }

            System.out.print("do you want to order again? (yes/no): ");
            String orderMore = scanner.next().toLowerCase();

            if (orderMore.equals("yes")) {
                continue;
            } else {
                order = false;
            }

            TotalAmount price = new TotalAmount();
            double totalPrice = price.total(listMenu);

            System.out.println("Your total amount is " + totalPrice);

        }
    }
}
