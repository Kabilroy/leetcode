class Solution {
    public boolean isPalindrome(int x) {
        String m = String.valueOf(x);
        String m1 = "";
        for(int i = m.length()-1;i>=0;i--)
        {
            m1+=m.charAt(i);
        }
        if(m.equals(m1)){
            return true;
        }
        System.out.println(m1);
        return false;
    }
}