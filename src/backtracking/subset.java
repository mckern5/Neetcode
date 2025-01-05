package backtracking;

import java.util.ArrayList;
import java.util.List;

class subsetsum{
	
	// Flag to check if there exists a subset with the given
    // sum
    static boolean flag = false;
 
    // Print all subsets if there is at least one subset of
    // set[] with the sum equal to the given sum
    static void printSubsetSum(int i, int n, int[] set,
                               int targetSum,
                               List<Integer> subset)
    {
        // If targetSum is zero, then there exists a subset.
        if (targetSum == 0) {
            // Prints a valid subset
            flag = true;
            System.out.print("[ ");
            for (int j = 0; j < subset.size(); j++) {
                System.out.print(subset.get(j) + " ");
            }
            System.out.print("]");
            return;
        }
 
        if (i == n) {
            // Return if we have reached the end of the
            // array
            return;
        }
 
        // Not considering the current element
        printSubsetSum(i + 1, n, set, targetSum, subset);
 
        // Consider the current element if it is less than
        // or equal to the targetSum
        if (set[i] <= targetSum) {
            // Push the current element in the subset
            subset.add(set[i]);
 
            // Recursive call for considering the current
            // element
            printSubsetSum(i + 1, n, set,
                           targetSum - set[i], subset);
 
            // Pop-back element after the recursive call to
            // restore the subset's original configuration
            subset.remove(subset.size() - 1);
        }
    }
	
	
}


public class subset {

	
	
	
	public static void main(String[] args) {
		
		
	
		
		// TODO Auto-generated method stub
		// Test case 1
        int[] set1 = { 1, 2, 1 };
        int sum1 = 4;
        //int n1 = set1.length;
        List<Integer> subset1 = new ArrayList<>();
        System.out.println("Output 1:");
        subsetsum.printSubsetSum(0, set1.length, set1, sum1, subset1);
        System.out.println();
        
        if (!subsetsum.flag) {
            System.out.println("There is no such subset");
        }
        subsetsum.flag = false;
 
        // Test case 2
        int[] set2 = { 3, 34, 4, 12, 5, 2 };
        int sum2 = 5;
        //int n2 = set2.length;
        List<Integer> subset2 = new ArrayList<>();
        System.out.println("Output 2:");
        subsetsum.printSubsetSum(0, set2.length, set2, sum2, subset2);
        if (!subsetsum.flag) {
            System.out.println("There is no such subset");
        }
	}

}
