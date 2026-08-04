class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for(int n :map.keySet()){
            if(map.get(n)%k == 0){
              for(int i = 1;i<=map.get(n);i++){
                sum+=n;
              }
            }
        }
        return sum;
    }
}