class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum  = 0;
        for(int i=0,j=nums.length-1;i<k;i++,j--){
            sum+=nums[j]-nums[i];
        }
        return sum;
    }
}