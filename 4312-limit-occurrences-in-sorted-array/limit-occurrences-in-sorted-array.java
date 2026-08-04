class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet())
        {     int val = map.get(i);
              if(val>k){
                for(int j=0;j<k;j++){
                    li.add(i);
                }
              }
              else{
                for(int o=0;o<val;o++){
                    li.add(i);
                }
              }
        }
        Collections.sort(li);
       int arr[] = new int[li.size()];
       int p =0;
       for(int i:li){
          arr[p] = i;
          p++;
       }
          return arr;
    }
}