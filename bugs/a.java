import java.util.ArrayList;
import java.util.List;

public class Tester {

    // BUG 1: Missing static keyword. 
    // main method cannot access a non-static variable directly.
    int globalCounter = 0; 

    public static void main(String[] args) {
        System.out.println("Starting the test program...");

        // BUG 2: Syntax Error. Missing semi-colon at the end of the line.
        String expectedUser = "admin"

        // BUG 3: Logic Bug (String Comparison). 
        // Using '==' instead of '.equals()' to check contents.
        if (args.length > 0 && args[0] == expectedUser) {
            System.out.println("Admin logged in!");
        }

        // BUG 4: Off-by-one Error (ArrayIndexOutOfBoundsException).
        // The loop uses '<=' instead of '<', causing it to overshoot the list size.
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        for (int i = 0; i <= items.size(); i++) {
            System.out.println("Item " + i + ": " + items.get(i));
        }

        // BUG 5: Resource Leak. 
        // A scanner or stream is often left open, but here we show a basic logic trap:
        // division by zero if totalItems is not checked.
        int totalItems = 0;
        int averagePrice = 100 / totalItems; 
        System.out.println("Average Price: " + averagePrice);
    }
}
