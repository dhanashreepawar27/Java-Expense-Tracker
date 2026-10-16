
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expense name: ");
        String name = sc.nextLine();

        System.out.print("Enter expense amount: ");
        double amount = sc.nextDouble();

        System.out.println("\n--- Expense Details ---");
        System.out.println("Expense: " + name);
        System.out.println("Amount: Rs. " + amount);

        sc.close();
    }
}
