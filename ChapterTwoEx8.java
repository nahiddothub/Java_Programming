package infinity;
import java.util.Scanner;
// create a java program .....where wins=3 points, draw=1 points and draw=0 point ; then summation all of points
public class ChapterTwoEx8 {
    public static void main(String[] args) {
        int wins_points = 3;
        int draws_points = 1;
        int losses_points = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count of wins: ");
        int wins = input.nextInt() * wins_points;
        System.out.println("Enter the count of draws: ");
        int draw = input.nextInt() * draws_points;
        System.out.println("Enter the count of losses: ");
        int losses = input.nextInt() * losses_points;
        int total_points = wins + draw + losses;
        System.out.println("Total points: " + total_points);
    }
}
