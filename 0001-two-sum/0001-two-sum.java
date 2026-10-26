class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Maps the number value to its index
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the required complement is already in the map
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Store the current number and its index
            numToIndex.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (guaranteed not to happen per constraints)
        return new int[] {};
    }
}
