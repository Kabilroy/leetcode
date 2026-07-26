class Solution {
    public int firstUniqueEven(int[] nums) {
       HashMap<Integer,Integer> map = new LinkedHashMap<>();
       for(int i = 0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       } 
       for(int x:map.keySet()){
        if(map.get(x)==1){
            if(x%2 == 0){
                return x;
            }
        }
       }
       return -1;
    }
}