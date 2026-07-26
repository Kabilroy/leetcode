class Solution {
    public int vowelConsonantScore(String s) {
        int count = 0;
        int count1 = 0;
       for(int i = 0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
        if(s.charAt(i)=='a' || s.charAt(i) =='e' || s.charAt(i)=='i'||s.charAt(i) =='o'|| s.charAt(i)=='u'){
            count++;
        }
        else{
            count1++;
        }
        }
       } 
       if(count1 == 0 || count ==0 )
       return 0;
       return count/count1;
    }
}