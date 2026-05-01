public class PowerRecursion {
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        int b = 2, e = 5;
        System.out.println(b + "^" + e + " = " + power(b, e));
    }
}
