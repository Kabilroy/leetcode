class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        for(int i = 0 ;i<words1.length;i++){
            map.put(words1[i],map.getOrDefault(words1[i],0)+1);
        }
        for(int j = 0;j<words2.length;j++){
            map1.put(words2[j],map1.getOrDefault(words2[j],0)+1);
        }
        int count = 0;
        for(String n:map.keySet()){
            if(map.get(n)==1 && map1.getOrDefault(n,0)==1){
                count++;
            }
        }
        return count;
    }
}