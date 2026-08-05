class Solution {
    public int maxFreqSum(String s) {
        char arr[] = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int v_max = 0;
        int c_max = 0;

        for(char i:map.keySet())
        {
            if(i=='a'||i=='e'||i=='o'||i=='i'||i=='u'){
                if(map.get(i)>v_max){
                    v_max = map.get(i);
                }
            }
        }
        
         for(char i:map.keySet())
        {
            if(i!='a' && i!='e' && i!='o' && i!='i' && i!='u'){
                if(map.get(i)>c_max){
                    c_max = map.get(i);
                }
            }
        }
        return v_max+c_max;
    }
}