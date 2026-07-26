class Solution {
    public int maximumProduct(int[] nums) {
      int a=nums.length;
      Arrays.sort(nums);
      int pro=nums[a-1]*nums[a-2]*nums[a-3];
      int po=nums[0]*nums[1]*nums[a-1];
      return Math.max(pro,po);  
    }
}