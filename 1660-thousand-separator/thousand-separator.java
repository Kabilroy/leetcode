class Solution {
    public String thousandSeparator(int n) {
        String k = String.valueOf(n);
        StringBuilder sb  = new StringBuilder();
        for(int i = 0;i<k.length();i++){
            if(i!=0 && (k.length()-i)%3 == 0){
                    sb.append(".");
            }
            sb.append(k.charAt(i));
        }
        return sb.toString();
    }
}