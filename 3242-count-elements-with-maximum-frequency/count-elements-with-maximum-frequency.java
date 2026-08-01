class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        for(int i :map.keySet())
        {
             if(map.get(i)>max){
                max = map.get(i);
             }
        }
        int count = 0;
        for(int i:map.keySet()){
            if(map.get(i)==max){
                count+=map.get(i);
            }
        }
        return count;
    }
}