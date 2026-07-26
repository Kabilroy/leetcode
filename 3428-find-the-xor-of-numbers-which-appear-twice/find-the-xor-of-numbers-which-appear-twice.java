class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         int num = 0;
        for(int x:map.keySet()){

            if(map.get(x)>1){
                 num = x^num;                                        
            }
        }
        return num;
    }
}