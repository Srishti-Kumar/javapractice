class Solution {
    public int[] buildArray(int[] nums) {
        int[] newN = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newN[i] = nums[nums[i]];
        }
        return newN;
    }
}
