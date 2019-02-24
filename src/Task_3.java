import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        System.out.println("Enter the weight: ");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        DecimalFormat df = new DecimalFormat("#.00");

        double ing = (double) weight * 453.6;
        int inkg = (int) ing / 1000;
        double ingr = ing - inkg * 1000;


        System.out.println("Weight in feet: " + weight);
        System.out.println("Weight in grams: " + df.format(ing));
        System.out.println("Kilograms: " + inkg);
        System.out.println("Grams: " + df.format(ingr));
    }
}
