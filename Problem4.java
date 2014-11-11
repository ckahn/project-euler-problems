/*
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String args[]) {

        int digits = Integer.parseInt(args[0]);
        int max = (int) Math.pow(10, digits)-1;
        int min = (int) Math.pow(10, digits-1); 
        int[] mpp = maxPalProduct(min, max);
        System.out.println("The largest palindrome made from the product of " +
                "two " + digits + "-digit numbers is " + mpp[2] + " = " +
                mpp[0] + " x " + mpp[1]);
    }

    // return the greatest palindromic product
    // of two numbers in the range
    private static int[] maxPalProduct(int min, int max) {
        int maxPP = 0;
        int[] prod = new int[3];
        int k = max;
        for (int i = max; i >= min; i--) {
            for (int j = max; j >= k; j--) {
                if (isPal(i*j) && i*j > maxPP) {
                    prod[0] = i;
                    prod[1] = j;
                    prod[2] = i*j;
                    maxPP = prod[2];
                }
            }
            k--;
        }
        return prod;
    }

    // is N palindromic (e.g., 23132)?
    private static boolean isPal(int N) {
        String s = String.valueOf(N);
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
