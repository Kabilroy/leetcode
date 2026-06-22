class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ap = new StringBuilder();
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i)=='#'){
                if(sb.length() != 0)
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        for(int j = 0; j < t.length();j++){
            if(t.charAt(j) == '#'){
                if(ap.length() != 0)
                ap.deleteCharAt(ap.length()-1);
            }
            else{
                ap.append(t.charAt(j));
            }
        }
        String m = sb.toString();
        String m1 = ap.toString();
        return m.equals(m1);
    }
}