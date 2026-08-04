class Solution {
    public int getLeastFrequentDigit(int n) {
        int min = Integer.MAX_VALUE;
        int r = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        String n1 = String.valueOf(n);
        for(char c:n1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
       for(char x:map.keySet()){
        if(map.get(x)<min){
            min = map.get(x);
            r = x-'0';
        }
        else if(map.get(x) == min && x-'0'<r){
            r = x-'0';
        }
       }
       return r;
    }
}