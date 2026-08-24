class Solution {
    public int maxDigitRange(int[] nums) {
       int arr[] = new int[nums.length];
       int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int temp = nums[i];
            while(temp>0)
            {
                int digit = temp%10;
                if(digit>max)
                {
                    max = digit;
                }
                if(digit<min)
                {
                    min = digit;
                }
                temp = temp/10;
            }
            arr[k++] = max-min;
            
        }
        
          
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
        {
            if(max == arr[i])
            {
                li.add(i);
            }
        }
        int sum = 0;
        for(int i = 0;i<li.size();i++)
        {
            sum+=nums[li.get(i)];
        }
        return sum;
    }
}