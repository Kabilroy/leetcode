class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                List<Integer> li = new ArrayList<>();
                for(int k = i;k<=j;k++){
                    li.add(arr[k]);
                }
                if(li.size()%2!=0){
                    for(int l:li){
                        sum+=l;
                    }
                }
            }
        }
        return sum;
    }
}