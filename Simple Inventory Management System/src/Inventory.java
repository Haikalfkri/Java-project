import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Add product to the inventory
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getProductName());
    }

    // remove a product from the inventory by ID
    public void removeProduct(String productId) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product removed: " + productToRemove.getProductName());
        } else {
            System.out.println("Product not found");
        }
    }

    // Display all products in the inventory
    public void displayInventory() {
        System.out.println("\nInventory");
        for (Product product : products) {
            product.displayProductInfo();
            System.out.println("-----------------");
        }
    }

}
