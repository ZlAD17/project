import java.util.Scanner;

public class Cashier {
    private Market market;
    private Bill bill;
    private Scanner input;

    public Cashier(Market market, Bill bill) {
        this.market = market;
        this.bill = bill;
        this.input = new Scanner(System.in);
    }

    public void startShopping() {
        while (true) {
            System.out.print("\nEnter item name (or 'done' to finish): ");
            String itemName = input.nextLine().trim();

            if (itemName.equalsIgnoreCase("done")) break;

            double price = market.getPrice(itemName);
            if (price != -1) {
                System.out.print("How many/much " + itemName + " do you want? ");
                double Quantity = Double.parseDouble(input.nextLine());
                bill.addEntry(itemName, Quantity, price);
                System.out.println("Added to your cart.");
            } else {
                System.out.println("Sorry, we don't have this item.");
            }
        }
    }
}

