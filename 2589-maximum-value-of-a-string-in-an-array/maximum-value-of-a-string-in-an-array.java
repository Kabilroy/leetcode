class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i = 0;i<strs.length;i++){
            String m = "";
            String n = "";
            for(int j = 0;j<strs[i].length();j++){
                if(Character.isLetter(strs[i].charAt(j))){
                    m+=strs[i].charAt(j);
                }
                else{
                    n+=strs[i].charAt(j);
                }
            }
            int r = 0;
            if(m.length()==0)
            r = Integer.parseInt(n);
            else{
                r=strs[i].length();
            }
            
            if(r>max){
                max = r;
            }
        }
        return max;
    }
}