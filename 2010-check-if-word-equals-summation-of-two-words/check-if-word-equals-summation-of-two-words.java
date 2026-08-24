class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        String a = "";
        String b = "";
        String c = "";
        for(int i = 0;i<firstWord.length();i++)
        {
            a+=firstWord.charAt(i)-'a';
        }

        for(int j = 0;j<secondWord.length();j++)
        {
            b+=secondWord.charAt(j)-'a';
        }
        
        for(int k = 0;k<targetWord.length();k++)
        {
            c+=targetWord.charAt(k)-'a';
        }
        long a1 = Long.parseLong(a);
        long b1 = Long.parseLong(b);
        long c1 = Long.parseLong(c);
        long sum = a1+b1;
        return sum == c1;
    }
}