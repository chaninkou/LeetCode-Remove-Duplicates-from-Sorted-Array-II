package leetcode80;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Since this problem only return the length of the array, pretty useless
		int[] nums = {0,1,1,1,2,2,2,3,4,5,5};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		RemoveDuplicateMoreThanTwoFunction solution = new RemoveDuplicateMoreThanTwoFunction();
		
		int[] answer = Arrays.copyOf(nums, solution.removeDuplicates(nums));
		
		System.out.println("Solution Array: " + Arrays.toString(answer));
	}
}
