class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li = new ArrayList<>();
        
        for(int i = 0; i<words.length;i++){
            boolean a=false;
            for(int j=0;j<words.length;j++){
                if(words[j].contains(words[i]) && i != j){
                    a=true;
                }
            }
            if(a){
                li.add(words[i]);
            }
        }
        return li;
    }
}