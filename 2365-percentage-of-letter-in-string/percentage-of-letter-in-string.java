class Solution {
    public int percentageLetter(String s, char letter) {
      int count = 0;
      for(int i = 0;i<s.length();i++)
      {
        if(letter == s.charAt(i)) count++;
      }  
      if(count == 0){
        return 0;
      }
      int k = (count*100)/s.length();
      return k;
    }
}