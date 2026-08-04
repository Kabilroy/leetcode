class Solution {
    public boolean checkGoodInteger(int n) {
      int sum = 0;
      int sq = 0;
      int temp = n;
      int temp1 = n;
      while(temp>0){
        int digit = temp%10;
        sum+=digit;
        temp/=10;
      }  
      while(temp1>0)
      {
        int digit = temp1%10;
        sq+= (int)Math.pow(digit,2);
        temp1/=10;
      }
      if((sq-sum)>=50){
        return true;
      }
      return false;
    }
}