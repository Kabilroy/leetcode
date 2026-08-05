class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int k = nums.length/2;
        int r = nums[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.get(r)==1){
            return true;
        }
          return false;
    }
}