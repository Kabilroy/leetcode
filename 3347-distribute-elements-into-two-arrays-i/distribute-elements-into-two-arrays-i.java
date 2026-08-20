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
        System.out.println(li);
        System.out.println(li1);
          int arr[] = new int[li.size()+li1.size()];
          int k = 0;
          for(int i = 0;i<li.size();i++){
             arr[k++] = li.get(i);
          }
          for(int i = 0;i<li1.size();i++)
          {
            arr[k++] = li1.get(i);
          }
          return arr;

        }

  
}
