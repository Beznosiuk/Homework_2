public class Task_2 {

    public static void main(String[] args){
        int number1 = 765;

        int cyfra3 = number1 % 10;
        int cyfra2 = (number1 % 100 - cyfra3) / 10;
        int cyfra1 = number1 / 100;
        int number2 = cyfra3 * 100 + cyfra2 * 10 + cyfra1;
        int result = number1 - number2;

        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);
        System.out.println("Result  = " + result);

    }
}
