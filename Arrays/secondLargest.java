//Link:https://www.naukri.com/code360/problems/second-largest-element-in-the-array_873375?leftPanelTabValue=SUBMISSION
//tc: O(n log n);
//sc : o(1)
// Status: Solved ✅ | Date: 2025-07-02

import java.util.*;
class secondLargest{
    	public static int findSecondLargest(int n, int[] arr) {
		Arrays.sort(arr);
		int maxi = arr[n-1];
		for(int i=n-2; i>=0; i--){
			if(arr[i] < maxi) return arr[i];
		}
		return -1;
	}
}