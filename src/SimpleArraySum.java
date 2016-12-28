import java.util.Scanner;

/**
 * Created by merrillm on 12/27/16.
 */
public class SimpleArraySum {
    
    /**
     * O(N) - Linear time complexity
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int numberOfInputs = scn.nextInt();
        int[] array = new int[numberOfInputs];
        
        for (int i = 0; i < numberOfInputs; i = i+1) {
            array[i] = scn.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < numberOfInputs; i = i+1) {
            sum = sum + array[i];
        }
        
        System.out.println(sum);
    }
}
