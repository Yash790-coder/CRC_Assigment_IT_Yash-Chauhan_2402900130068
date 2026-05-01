public class NumberCheck {
    // Check Prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check Armstrong (sum of cubes of digits = number)
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += d*d*d;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 153 Armstrong? " + isArmstrong(153));
    }

}
