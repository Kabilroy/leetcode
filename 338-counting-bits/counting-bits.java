class Solution {
    public int[] countBits(int n) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0;i<=n;i++)
        {
            int temp = i;
            int count = 0;
            while(temp >0){
                if(( temp & 1 )==1)count++;
               temp>>=1;
            }
            li.add(count);
        }
        int arr[] = new int[li.size()];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] =li.get(i);

        }
        
        return arr;
    }
}