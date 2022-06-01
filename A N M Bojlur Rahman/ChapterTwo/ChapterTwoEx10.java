package infinity;
import java.util.Scanner;
//Calculate degree
public class ChapterTwoEx10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radian: ");
        double radian = input.nextDouble();
        double PI = 3.1416;
        double degree = radian * (180/PI);
        System.out.println("Result of degree: " + degree);
    }
}
