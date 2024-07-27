package exponent;

public class Exponent {
    public static void main(final String[] args) {
        System.out.println("Testing: " + exponent(4, 3));

    }

    private static long exponent(int a, int b) {
        if (b == 0) {
            return 1;
        }

        long x = exponent(a, Math.floorDiv(b, 2));

        if (b % 2 == 0) {
            x = x * x;
        } else {
            x = a * x * x;
        }

        return x;
    }
}
