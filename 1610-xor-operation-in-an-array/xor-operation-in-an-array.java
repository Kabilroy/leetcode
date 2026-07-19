class Solution {
    public int xorOperation(int n, int start) {
      int num = 0;
      int arr[] = new int[n];
      for(int i = 0;i<arr.length;i++){
        arr[i] = start+2*i;
      }  
     for(int i = 0;i<arr.length;i++){
        num=arr[i]^num;
     }
     return num;
    }
}