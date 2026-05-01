class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) {
            return false;
        }

        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }

        return false;
    }
}