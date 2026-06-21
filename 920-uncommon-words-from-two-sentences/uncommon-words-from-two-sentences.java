class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String r[] = s1.split("\\s+");
        String r1[] = s2.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String k : r){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(String l : r1){
            map.put(l,map.getOrDefault(l,0)+1);
        }
        List<String> li = new ArrayList<>();
        for(String n : map.keySet()){
            if(map.get(n)==1){
                 li.add(n);
            }
        }
           
           String [] n = new String [li.size()];

           for(int k=0;k<n.length;k++)
           {
               n[k] = li.get(k);
           }
           return n;
    }
}