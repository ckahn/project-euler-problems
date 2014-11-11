/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem3 {

    public static void main(String args[]) {

        long N = Long.parseLong(args[0]);
        long maxPrimeFactor = 0;
        
        long start = (long) Math.sqrt(N);
        if (start % 2 == 0)
            start++;
        
        for (long i = start; i > 2; i -= 2)
            if (N % i == 0 && isPrime(i)) {
                maxPrimeFactor = i;
                break;
            }

        System.out.println("The largest prime factor of " + N + " is "
                + maxPrimeFactor);
    }

    private static boolean isPrime(long N) {
        if (N == 2 || N == 3)
            return true;
        if (N % 2 == 0 || N % 3 == 0) 
            return false;
        for (long i = 5; i < N/2; i += 2)
            if (N % i == 0)
                return false;
        return true;
    }
}
