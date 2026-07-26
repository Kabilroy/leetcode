class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }
        List<Integer> li = new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)%2!=0){
                li.add(x);
            }
        }
        Collections.sort(li);
        return li;
    }
}