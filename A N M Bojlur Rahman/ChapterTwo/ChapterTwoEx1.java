package infinity;
import java.util.Scanner;
// Input number from keyboard, calculate addition,subtraction, multiply, division.
public class ChapterTwoEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We have to calculate an addition, subtraction, multiply, division of two integer;");
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("The sum = " +sum);
        System.out.println("The sub = " +sub);
        System.out.println("The mul = " +mul);
        System.out.println("The div = " +div);
    }
}
