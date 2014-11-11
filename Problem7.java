/* 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see 
 * that the 6th prime is 13.
 * 
 * What is the 10,001st prime number?
 */

public class Problem7 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int prime = 1;
        int count = 0;
        
        int i = prime;
        while (count < N) {
            if (isPrime(i)) {
                prime = i;
                count++;
            }
            i += 2;
        }
        
        System.out.println("The " + count + "th prime number is " + prime);
    }
    
    private static boolean isPrime(int N) {
        if (N == 2 || N == 3)
            return true;
        if (N % 2 == 0 || N % 3 == 0) 
            return false;
        for (int i = 5; i <= Math.sqrt(N); i += 2)
            if (N % i == 0)
                return false;
        return true;
    }
    
}
