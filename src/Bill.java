import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<String> itemsList = new ArrayList<>();
    private double totalCost = 0;

    public void addEntry(String name, double Quantity, double price) {
        double Total = Quantity * price;
        totalCost += Total;
        itemsList.add(String.format("%-10s | %-5.1f | %-10.2f", name, Quantity, Total));
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void printReceipt(double paid) {
        System.out.println("\n----------- FINAL BILL -----------");
        System.out.println(" Item    | Quantity | Total ");
        for (String line : itemsList) {
            System.out.println(line);
        }
        System.out.println("----------------------------------");
        System.out.println("Total Cost: " + totalCost + " EGP");
        System.out.println("Cash Paid : " + paid + " EGP");
        System.out.println("Change    : " + (paid - totalCost) + " EGP");
        System.out.println("----------------------------------");
    }
}