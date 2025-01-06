package Slidingwindow;

import java.util.HashSet;

//improve on this to return set
class GFG{	
	
	// Same problem using sliding window.
    // O(n)
    public static boolean closeDuplicates(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>(); // Cur window of size <= k
        int L = 0;

        for (int R = 0; R < nums.length; R++) {
            if (R - L + 1 > k) {
                window.remove(nums[L]);
                L++;
            }
            if (window.contains(nums[R])) {
                return true;
            }
            window.add(nums[R]);
        }
        return false;
    }

}
public class slidingwindowfixedsize {

	public static void main(String[] args) {

	
	
	int[] arr={1,2,4,2,3,5};
	System.out.println(GFG.closeDuplicates(arr, 2));
	
	}
	
}
