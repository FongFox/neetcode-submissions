class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int numFinding = target - nums[i];
            if(hashMap.containsKey(numFinding)) {
                return new int[] {hashMap.get(numFinding), i};
            }
            hashMap.put(nums[i], i);
        }

        return new int[2];
    }
}
