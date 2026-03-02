import java.util.HashMap;
import java.util.Map;

public class Market {
    private Map<String, Double> productDatabase = new HashMap<>();

    public Market() {

        productDatabase.put("rice", 50.0);
        productDatabase.put("flour", 30.0);
        productDatabase.put("pasta", 40.0);
        productDatabase.put("water", 10.0);
        productDatabase.put("oil", 70.0);
        productDatabase.put("milk", 20.0);
        productDatabase.put("chocolate", 25.0);
        productDatabase.put("cake", 100.0);
        productDatabase.put("candy", 5.0);
    }

    public double getPrice(String productName) {
        return productDatabase.getOrDefault(productName.toLowerCase(), -1.0);
    }

    public void showProducts() {
        System.out.println("\n--- Available Products in Market ---");
        productDatabase.forEach((name, price) -> System.out.println("- " + name + ": " + price + " EGP"));
    }


}