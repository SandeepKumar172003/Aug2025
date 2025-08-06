package Day3;
import java.util.Arrays;

public class lab3program4 {
    public static void main(String[] args) {
        String[] products = {"Keyboard", "Mouse", "Monitor", "Laptop", "Charger"};

        System.out.println("Original Product Names:");
        for (String product : products)
        {
            System.out.println(product);
        }

       
        Arrays.sort(products);

        System.out.println("Sorted Product Names:");
        for (String product : products)
        {
            System.out.println(product);
        }
    }
}