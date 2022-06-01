package infinity;
import java.util.Scanner;
// Calculate area and perimeter of a rectangle
public class ChapterTwoEx5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the value of length:");
        int length = Input.nextInt();
        System.out.println("Enter the value of length:");
        int width = Input.nextInt();
        int areaOfRectangle = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Rectangle : " + areaOfRectangle);
        System.out.println("perimeter of this rectangle: " + perimeter);
    }
}
