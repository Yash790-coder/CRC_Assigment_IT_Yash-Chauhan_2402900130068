import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter Principal: ");
            double principal = sc.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = sc.nextDouble();

            
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + simpleInterest);

            
            double compoundInterest = principal * Math.pow((1 + rate/100), time) - principal;
            System.out.println("Compound Interest = " + compoundInterest);
        }
    }
}
