package infinity;
import java.util.Scanner;
public class ComputerArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of respective area:");
        double radius = input.nextDouble();
        double area = radius * radius * 3.1416;
        System.out.println("Area : " + area);
    }
}
