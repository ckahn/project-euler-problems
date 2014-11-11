/*
 * 2520 is the smallest number that can be divided by each of the numbers from 
 * 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the 
 * numbers from 1 to 20?
 */
public class Problem5 {

    public static void main(String args[]) {

        int N = Integer.parseInt(args[0]);
        
        int divisor = N;
        int i = N;
        int increment = N;
        
        while (divisor > 2) {   
            if (i % (divisor-1) == 0) {
                increment = i;
                divisor--;
            }  
            if (i % (divisor-1) != 0) {
                i += increment;
            }  
        }

        System.out.println("The smallest positive number that is evenly " +
                "divisible by all of the numbers from 1 to " + N + " is " +
                i);
    }
}
