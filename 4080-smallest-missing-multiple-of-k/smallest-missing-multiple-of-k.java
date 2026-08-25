class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        Arrays.sort(nums);
        boolean a = true;
        int mul = k;
        while(a)
        {
            a = false;
            for(int i = 0;i<nums.length;i++)
            {
                if(mul==nums[i])
                {
                    a = true;
                    break;
                }
            }
            if(a)
            {
                mul+=k;

            }
            else{
                return mul;
            }
        }
        return -1;
    }
}