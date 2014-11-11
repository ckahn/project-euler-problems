/* 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, 
 * for which, a^2 + b^2 = c^2.
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2. 
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Problem9 {

    public static void main(String args[]) {
        int abc = 0;

        int N = Integer.parseInt(args[0]);

        for (int b = 1; b < N; b++) {
            for (int c = b+1; b+c < N; c++) {
                int aSq = c*c - b*b;
                double a = Math.sqrt(aSq);
                if (a == (int) a && a < b)
                    if (a+b+c == N) {
                        abc = (int) a*b*c;
                        break;
                    }
            }
            if (abc != 0) 
                break;
        }

        if (abc == 0) 
            System.out.println("There is no a, b and c that form a " +
                    "Pythagorean triple and sum to " + N);
        else 
            System.out.println("The product abc, where a, b and c form a " +
                    "Pythagorean triple and sum to " + N + ", is " + abc);
    }
}