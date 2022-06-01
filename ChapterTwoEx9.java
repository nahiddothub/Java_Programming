package infinity;
import java.util.Scanner;
// Calculate the volume of a box
public class ChapterTwoEx9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        System.out.println("Enter the value of c: ");
        int c = input.nextInt();
        int volume = a * b * c;
        System.out.println("The volume of box:" +volume);
    }

}
