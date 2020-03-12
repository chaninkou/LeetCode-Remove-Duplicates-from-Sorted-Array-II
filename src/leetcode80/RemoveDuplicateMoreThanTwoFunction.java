package leetcode80;

public class RemoveDuplicateMoreThanTwoFunction {
    public int removeDuplicates(int[] nums) {
    	// Starting from 2 since we don't care what the first two elements are
        int position = 2;
        
        for(int i = 2; i < nums.length; i++){
        	// Keep comparing the previous previous element
            if(nums[i] != nums[position - 2]){
                nums[position] = nums[i];
                position++;
            }
        }
        
        return position;
    }
    
    public int removeDuplicates1(int[] nums) {
        int position = 0;
        
        for(int n : nums){
        	// Before index 2, keep doing inplace replacement, then compare the previous previous element
            if(position < 2 || n > nums[position - 2]){
                nums[position] = n;
                position++;
            }
        }
        
        return position;
    }
}
