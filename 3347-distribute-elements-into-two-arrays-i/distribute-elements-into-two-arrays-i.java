class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();
        li.add(nums[0]);
        li1.add(nums[1]);
        
        for(int i = 2;i<nums.length;i++)
        {
              
               if(li.get(li.size()-1)>li1.get(li1.size()-1)) 
               {
                 
                 li.add(nums[i]);   
                
                             }
            
            else{
                
                {
                    li1.add(nums[i]);
                    
                }
            }
        }
        
         li.addAll(li1);
         for(int i = 0;i<nums.length;i++)
         {
            nums[i] = li.get(i);
         }
           return nums;
        }

  
}
