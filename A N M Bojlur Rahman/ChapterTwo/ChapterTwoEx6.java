package infinity;
import java.util.Scanner;
import java.lang.Math;
// Calculate area of a hexagon
public class ChapterTwoEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
        double area =( 3 * (Math.sqrt(3)) * (a * a)) / 2;
        System.out.println("The area of Hexagon: " + area );
    }
}
