class Solution {
    public int findFinalValue(int[] nums, int original) 
    {
    
       for(int i = 0;i<nums.length;i++)
       {
        boolean a = false;
        for(int j = 0;j<nums.length;j++)
        {
            if(nums[j]==original)
            {
                a = true;
            }
        }
         if(a)
         {
            original = original*2;
            i=-1;
         }
         else
         {
             return original;
         }
         

       } 
       return -1;
    }
}