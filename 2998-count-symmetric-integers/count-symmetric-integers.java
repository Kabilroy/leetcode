class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low;i<=high;i++)
        {
             int sum = 0;
             int sum1 = 0;
             String m  = String.valueOf(i);
             
            if(m.length()%2 ==0)
            {
                int  k = m.length()/2;
               
                for(int j = 0;j<k;j++)
                {  
                      sum += m.charAt(j) - '0';
                }
                for(int l = k;l<m.length();l++)
                {
                      sum1+= m.charAt(l) - '0';
                }
                 if(sum == sum1)
            {
                   count++;  
               }
            }
           
        }
        return count;
    }
}