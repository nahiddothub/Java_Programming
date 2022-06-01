package infinity;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We have to calculate an addition;");
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum = " +sum);

    }
}
