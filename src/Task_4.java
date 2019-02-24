import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Enter the annual interest rate: ");
        Scanner scanner1 = new Scanner(System.in);
        int rate = scanner1.nextInt();

        System.out.println("Enter the number of days: ");
        Scanner scanner2 = new Scanner(System.in);
        int days = scanner2.nextInt();

        System.out.println("Enter the number of days per year: ");
        Scanner scanner3 = new Scanner(System.in);
        int daysPerYear = scanner3.nextInt();

        System.out.println("Enter the initial amount: ");
        Scanner scanner4 = new Scanner(System.in);
        int initialAmount = scanner4.nextInt();

        float amountOfIncome = initialAmount + ((initialAmount * rate * days) / (daysPerYear * 100));

        System.out.println("Amount of income: " + amountOfIncome);
    }
}
