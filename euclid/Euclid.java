package euclid;

public class Euclid {
    public static void main(String[] args) {
        int result = euclid(15298, 42);
        System.out.println("The GCD " + result);
    }


    public static int euclid(int m, int n) {

        if (m < n)  {
            //swap values
            int tmp = m;
            m = n;
            n = tmp;
        }

        int remainder = m%n;

        // is r == 0?
        if (remainder == 0 ) {
            return n;
        } else {
            //set m <- n, n <- r
            return euclid(n, remainder);
        }
    }
}
