public class GCDRecursion {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int x = 48, y = 18;
        System.out.println("GCD of " + x + " and " + y + " = " + gcd(x, y));
    }
}

