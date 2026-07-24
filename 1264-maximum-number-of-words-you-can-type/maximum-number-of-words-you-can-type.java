class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] a = text.split("\\s+");
        int count = 0;
        for(int i = 0;i<a.length;i++){
            boolean a1 = false;
            for(int j =0;j<brokenLetters.length();j++){
                String m = String.valueOf(brokenLetters.charAt(j));
                if(a[i].contains(m)){
                    a1 = true;
                    break;
                }
            }
            if(!a1)
            count++;
        }
        return count;
    }
}