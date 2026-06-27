import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Phone", "Mobile")

        };

        System.out.println("Linear Search");

        Product result = SearchAlgorithms.linearSearch(products, "Keyboard");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, "Keyboard");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found");
    }
}