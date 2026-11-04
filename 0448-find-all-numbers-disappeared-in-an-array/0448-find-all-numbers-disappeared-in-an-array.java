class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        int n = nums.length;
        
        // Step 1: Mark visited indices as negative
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            // Only negate if it hasn't been negated already
            if (nums[val - 1] > 0) {
                nums[val - 1] = nums[val - 1] * -1;
            }
        }
        
        // Step 2: Identify missing numbers (indices that are still positive)
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                output.add(i + 1); // The index + 1 is the missing number
            }
        }
        
        return output;
    }
}
