public class SumNaturalRecursion {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Sum of first " + num + " natural numbers = " + sum(num));
    }
}
