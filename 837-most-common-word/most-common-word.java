class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        String word[] = paragraph.toLowerCase().split("[^a-z]+");
        HashMap<String,Integer> map = new HashMap<>();
        List<String> li = new ArrayList<>();
        for(int i = 0;i<word.length;i++)
        {   boolean a = true;
            for(int j = 0;j<banned.length;j++)
            {
                if(word[i].equals(banned[j])){
                    a = false; 
                    break;

                }
            }
            if(a){
                li.add(word[i]);
            }
        }
        
        for(String x:li)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        String m = "";
        for(String x:map.keySet()){
            if(map.get(x)>max)
            {
                max = map.get(x);
                m = x;
            }
        }
        return m;
    }
}