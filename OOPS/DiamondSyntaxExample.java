import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondSyntaxExample {
    public static void main(String[] args) {
        // Using diamond syntax
        Map<String, List<String>> myMap = new HashMap<>();

        // Without diamond syntax (pre-Java 7)
        // Map<String, List<String>> myMap = new HashMap<String, List<String>>();

        System.out.println("Created a Map using diamond syntax: " + myMap);
    }
}
