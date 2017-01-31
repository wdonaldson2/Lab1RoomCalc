import java.util.Scanner;

/**
 * Created by williamdonaldson on 1/30/17.
 */
public class RoomCalc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choose = 1;

        while (choose == 1) {
            System.out.println(" Enter length ");
            double length = scan.nextDouble();

            System.out.println(" Enter Width ");

            double width = scan.nextDouble();

            double area = (length * width);
            System.out.println("Area: " + length * width);

            System.out.println("Perimeter: " + (length * 2 + width * 2));

            System.out.println("Continue? enter 1 for yes or 2 for no");
            choose = scan.nextInt();
        }
    }
}
