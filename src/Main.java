import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market myMarket = new Market();
        Bill myBill = new Bill();
        Cashier myCashier = new Cashier(myMarket, myBill);

        System.out.println("=== Welcome to Interactive Grocery System ===");
        myMarket.showProducts();

        myCashier.startShopping();

        if (myBill.getTotalCost() > 0) {
            System.out.print("\nTotal amount: " + myBill.getTotalCost() + " EGP. \nPlease enter cash: ");
            double cash = Double.parseDouble(sc.nextLine());
            myBill.printReceipt(cash);
        }

        System.out.println("Thank you for shopping with us!");
    }
}


