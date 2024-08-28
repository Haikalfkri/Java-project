import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    Product product = new Product(productId, productName, price, quantity);
                    inventory.addProduct(product);
                    break;

                case 2:
                    System.out.print("Enter Product Id to remove: ");
                    String removeId = scanner.nextLine();
                    inventory.removeProduct(removeId);
                    break;

                case 3:
                    inventory.displayInventory();
                    break;

                case 4:
                    System.out.println("Existing system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        scanner.close();

    }
}