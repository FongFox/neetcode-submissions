class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(temp.contains(nums[i])) {
                return true;
            }
            temp.add(nums[i]);
        }

        return false;
    }
}