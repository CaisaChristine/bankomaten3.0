//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int choice = -1;

        List<Integer> history = new ArrayList<>();

        showWelcome();

        while (choice != -0) {

            showMenu();
        System.out.print("Choice: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Your balance is: " + balance + " kr");
        } else if (choice == 2) {
            balance += 500;
            history.add(500);
            System.out.println("Your balance is: "  + balance + " kr" );
        } else if (choice == 3) {
            int interest = calculateInterest(balance, 5);
            System.out.println("Yearly interest: " + interest + " kr");
        } else if (choice == 4) {
            for (int i = 0; i < history.size(); i++) {
            System.out.println("Deposit: " + history.get(i) + " kr"); }
        }
        else if (choice == 0) {
            System.out.println("Card returns. Bye!");
        }
    }
    }
    public static void showWelcome () {
        System.out.println("Welcome");
    }

    public static void showMenu () {
        System.out.println("1. See balance | 2. Insert | 3. See interest | 0. Finish");
    }

    public static int calculateInterest (int amount, int rate) {
        return amount * rate / 100;
    }
}