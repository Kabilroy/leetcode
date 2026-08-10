class Solution {
    public String longestPalindrome(String s) {
         int k = 0;
        int j = 0;
         int max = 0;
        for(int i = 0;i<s.length();i++){
           
            int left =i;
            int right = i;
            while(left>=0 && right<s.length()){
            if(s.charAt(left)!=s.charAt(right))
            {
                break;
            }
            left--;
            right++;
            }
            if(right-left>max){
                max = right-left-1;
                k = left+1;
                j = right;

            }

        }
        for(int i = 0;i<s.length();i++)
        {
            int left = i;
            int right = i+1;
            
            while(left>=0 && right<s.length()){
            if(s.charAt(left)!=s.charAt(right))
            {
                break;
            }
            left--;
            right++;
            }
            if(right-left>max)
            {
                max =right-left-1;
                k = left+1;
                j = right;
            }
        }
        return s.substring(k,j);
    }
}