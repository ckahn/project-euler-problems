/* 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */

public class Problem10 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		long sum = 2; // 2 pre-added so we can check 1, 3, 5, ...
		for (int i = 1; i < N; i+=2)
			if (isPrime(i))
				sum += i;

		System.out.println("The sum of all primes below " + N + " is " + sum);
	}

	private static boolean isPrime(int N) {
		if (N < 2)
			return false;
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