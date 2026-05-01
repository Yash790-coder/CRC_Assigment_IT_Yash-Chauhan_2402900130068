import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read radius
            System.out.print("Enter radius of the circle: ");
            double radius = sc.nextDouble();

            // Calculate area and circumference
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            // Print results
            System.out.println("Area of the circle = " + area);
            System.out.println("Circumference of the circle = " + circumference);
        }
    }
}
