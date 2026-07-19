class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[] = new int[prices.length];
        arr[arr.length-1] = prices[prices.length-1];
        for(int i = 0;i<arr.length;i++){
            boolean a =false;
            for(int j=i+1;j<arr.length;j++){
               if(prices[i]>=prices[j]){
                  arr[i] = prices[i]-prices[j];
                   a =true;
                  break;
               }
            }
            if(!a){
                arr[i] = prices[i];
            }
        }
        return arr;
    }
}