//link:https://www.naukri.com/code360/problems/sort-odd-even_5558623
//TC : O(n log n)
//SC: O(N);
// Status: Solved ✅ | Date: 2025-06-23
import java.util.*;

class sortEvenOdd{
    	public static void sortOddEven(int[] nums) {
		// Write your code here.
		int ecount = 0;
		int ocount = 0;
		int n = nums.length;
		for(int i=0; i<n; i++){
			if(nums[i]  % 2 == 0) ecount++;
			else ocount++;
		}
		int[] even = new int[ecount];
		int[] odd = new int[ocount];

		int e =0, o=0;

		for(int i=0; i<n; i++){
			if(nums[i] % 2  == 0)even[e++] = nums[i];
			else odd[o++] = nums[i];
		}

		Arrays.sort(even);
		Arrays.sort(odd);
		int index = 0;

		for(int i=odd.length-1; i>=0; i--){
			nums[index++] = odd[i];
		}
		for(int i=0; i<even.length; i++){
			nums[index++] = even[i];
		}
	}
}