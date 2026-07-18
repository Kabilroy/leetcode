class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       System.out.println(Arrays.toString(nums));
       int n = nums[0];
       int n1 = nums[nums.length-1];
       int max=0;
       for(int i = 1;i<=n1;i++){
        if(n%i == 0 && n1%i == 0){
           max = Math.max(max,i);
        }
       }
       return max;
    }
}