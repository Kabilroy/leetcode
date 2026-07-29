class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
       int arr[] = new int[numOnes+numZeros+numNegOnes];
       int k1 = 0;
       while(numOnes>0){
           arr[k1]=1;
           k1++;
           numOnes--;
       } 
         while(numZeros>0){
           arr[k1]=0;
           k1++;
           numZeros--;
       } 
       while(numNegOnes>0){
           arr[k1]=-1;
           k1++;
           numNegOnes--;
       } 
       Arrays.sort(arr);
       int sum = 0;
       for(int i = arr.length-1;i>=arr.length-k;i--){
         sum+=arr[i];
       }
       return sum;
    }
}