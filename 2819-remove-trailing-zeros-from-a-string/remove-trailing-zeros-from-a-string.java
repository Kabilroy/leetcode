class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        int k = num.length();
        for(int i = num.length()-1;i>0;i--)
        {
            if(num.charAt(i)=='0'){
                k--;
                continue;
            }
            else
            {
                break;
            }
        }
        
        for(int i = 0;i<k;i++){
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}