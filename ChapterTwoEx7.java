package infinity;
import java.util.Scanner;
import java.lang.Math;
// Calculate distance with two points
public class ChapterTwoEx7 {
    public static void main(String[] args) {
        System.out.println("Enter the value of x_1: ");
        Scanner input = new Scanner(System.in);
        double x_1 = input.nextDouble();
        System.out.println("Enter the value of x_2: ");
        double x_2 = input.nextDouble();
        System.out.println("Enter the value of y_1: ");
        double y_1 = input.nextDouble();
        System.out.println("Enter the value of y_2: ");
        double y_2 = input.nextDouble();
        double a = Math.pow(x_2 - x_1, 2) + Math.pow(y_2 - y_1, 2);
        double distance = Math.sqrt(a);
        System.out.println("Distance between two points: " + distance);
    }
}
