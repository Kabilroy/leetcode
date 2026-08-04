class Solution {
    public int digitFrequencyScore(int n) {
       HashMap<Character,Integer> map = new HashMap<>();
        String n1 = String.valueOf(n);
        for(char a:n1.toCharArray())
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int sum = 0;
        for(char a:map.keySet())
        {
           int pro =1;
           int i = a-'0';
           
            pro=i*map.get(a);
            sum+=pro;
        }
        return sum;
    }
}