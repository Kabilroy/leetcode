class Solution {
    public int sumOfPrimesInRange(int n) {
       int rev = 0;
       int temp  = n;
       int sum = 0;
       while(temp>0)
       {
         int digit = temp%10;
         rev = rev*10+digit;
         temp/=10;
       } 
       if(rev<n){
           for(int i = rev;i<=n;i++){
        boolean is = true;
        if(i<=1){
            is = false;
        }
    for(int j = 2;j<=Math.sqrt(i);j++)
    {
        if(i%j==0)
        {
           is = false;
           break;
        }
    }
    if(is)
    sum+=i;
    }
       }
       else{
    for(int i = n;i<=rev;i++){
        boolean is = true;
        if(i<=1){
            is = false;
        }
    for(int j = 2;j<=Math.sqrt(i);j++)
    {
        if(i%j==0)
        {
           is = false;
           break;
        }
    }
    if(is)
    sum+=i;
    }
       }
    return sum;
    }
}