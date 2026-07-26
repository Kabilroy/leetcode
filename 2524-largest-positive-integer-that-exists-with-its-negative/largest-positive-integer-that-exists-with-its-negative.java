class Solution {
    public int findMaxK(int[] nums) {
        int q = -1;
        int max = -1;
       for(int i = 0;i<nums.length;i++){
        
        for(int j = 0;j<nums.length;j++){
            if(nums[i] == (-(nums[j]))){
                if(nums[i]> max){
                    max = nums[i];
                    q = max;
                }
            }
        }
       } 
       return max;
    }
}