public class Task_1 {

    public static void main(String[] args){
       int val1 = 34;
       int val2 = 25;

        System.out.println("a = " + val1);
        System.out.println("b = " + val2);

        val1 = val1 + val2;
        val2 = val2 - val1;
        val2 = -val2;
        val1 = val1 - val2;

        System.out.println("After the change:");
        System.out.println("a = " + val1);
        System.out.println("b = " + val2);

    }
}
