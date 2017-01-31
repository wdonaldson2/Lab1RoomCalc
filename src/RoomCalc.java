import java.util.Scanner;

/**
 * Created by williamdonaldson on 1/30/17.
 */
public class RoomCalc {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter length ");
        double length = scan.nextDouble();

        System.out.println(" Enter Width ");

        double width = scan.nextDouble();

        System.out.println("Enter Area");

        double area = scan.nextDouble();

        double perimeter = (length * width);
        System.out.println ("the perimeter is " + (length * 2 + width * 2));

        System.out.println("Continue? (y/n)");

        scan.close();
    }
}
