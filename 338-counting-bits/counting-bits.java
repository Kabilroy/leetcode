class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i = 0;i<=n;i++){
            String a = Integer.toBinaryString(i);
            int count=0;
            for(char a1:a.toCharArray()){
                if(a1=='1'){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}