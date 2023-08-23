class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the elements and their indices
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the value we need to find in the array
            int result = target - nums[i];

            // If the hash map contains the needed value, return the indices
            if (hashMap.containsKey(result)) {
                return new int[]{hashMap.get(result), i};
            }

            // Otherwise, add the current element to the hash map with its index
            hashMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }
}
