public class Solution {
    public bool IsPalindrome(int x) {
        int n = x;
        int rev =0;
        while(n>0){
            int digi = n%10;
            rev = rev*10+digi;
            n/=10;
        }
        Console.WriteLine(rev);
        if(x != rev){
            return false;
        }
        return true;
    }
}