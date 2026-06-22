class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
       
        for(char a : s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
         int odd=Integer.MIN_VALUE;
         int even=Integer.MAX_VALUE;

        for(char c :map.keySet()){
            if(map.get(c)%2==0){
               even = Math.min(even,map.get(c));
            }
            else{
                odd = Math.max(odd,map.get(c));
               
            }
           
        
    }
    return odd-even;
    }
}
