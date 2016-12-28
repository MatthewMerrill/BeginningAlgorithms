import java.util.Scanner;

/**
 * Created by merrillm on 12/27/16.
 */
class SolveMeFirst {
    
    /**
     * O(1) Time complexity - always takes same amount of time regardless of input
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // First number
        int a = scn.nextInt();
        // Second number
        int b = scn.nextInt();
        
        // Sum of A and B
        int sumAB = a + b;
        
        System.out.println(sumAB);
    }
    
}
