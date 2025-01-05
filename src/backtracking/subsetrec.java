package backtracking;


//modify to return index values instead of just true false

  class GfG {

    // Function to check if there is a subset
    // with the given sum using recursion
       static boolean isSubsetSumRec(int[] arr, int n, int sum) {
      
        // Base Cases
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        // If last element is greater than 
          // sum, ignore it
        if (arr[n - 1] > sum) {
            return isSubsetSumRec(arr, n - 1, sum);
        }

        // Check if sum can be obtained by including 
          // or excluding the last element
        return isSubsetSumRec(arr, n - 1, sum) ||  isSubsetSumRec(arr, n - 1, sum - arr[n - 1]);
    }


	static boolean isSubsetSum(int[] arr, int sum) {
	    return isSubsetSumRec(arr, arr.length, sum);
	}


}
 
public class subsetrec {
	
	public static void main(String[] args) {
		

		
		// TODO Auto-generated method stub
		int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        if (GfG.isSubsetSum(arr, sum)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    
	}

}
