class Solution {
    public int maxProduct(int n) {
        int max = 0;
        String r = String.valueOf(n);
        int arr[] = new int[r.length()];
        int k = 0;
        
        while(n>0){
        int digit = n%10;
         arr[k] = digit;
         k++;
         n/=10;
        }
       for(int i = 0;i<arr.length;i++)
       {
           for(int j = i+1;j<arr.length;j++)
           {
              int  pro = arr[i] * arr[j];
             if(pro>max){
                max = pro;
             }
           }
       }
        return max;
    }
}