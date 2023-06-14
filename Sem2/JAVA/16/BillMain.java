import java.util.*;

interface Billable {

    double calculate();
}


class Product implements Billable {
    private String id;
    private String name;
    private int quantity;
    private double unitPrice;
    private double total;

    public Product(String id, String name, int quantity, double unitPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = quantity * unitPrice;
    }

    public double calculate() {
        return total;
    }

  
    public String toString() {
        return String.format("%-10s %-20s %-10d Rs%.2f Rs%.2f",
                id, name, quantity, unitPrice, total);
    }
}

public class BillMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter Order Number: ");
        int orderNumber = scanner.nextInt();
        System.out.print("Enter Order Date: ");
        String orderDate = scanner.next();

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        for (int i = 1; i <= numProducts; i++) {
            System.out.println("Product " + i + ":");
            System.out.print("Enter Product ID: ");
            String id = scanner.next();
            System.out.print("Enter Product Name: ");
            String name = scanner.next();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();

            Product product = new Product(id, name, quantity, unitPrice);
            products.add(product);
        }

      
        System.out.println("\n===========================================");
        System.out.println("               INVOICE BILL");
        System.out.println("===========================================");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Order Date: " + orderDate);
        System.out.println("-------------------------------------------");
        System.out.println("Product ID  Product Name       Quantity  Unit Price  Total");
        System.out.println("-------------------------------------------");
        double grandTotal = 0;

        for (Product product : products) {
            System.out.println(product);
            grandTotal += product.calculate();
        }

        System.out.println("-------------------------------------------");
        System.out.printf("%-46s Rs%.2f\n", "Grand Total:", grandTotal);
    }
}


