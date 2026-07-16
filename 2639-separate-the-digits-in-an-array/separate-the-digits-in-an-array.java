class Solution {
    public int[] separateDigits(int[] nums) {
      
        List<Integer> li1 = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
              List<Integer> li = new ArrayList<>();
            int n = nums[i];
            while(n>0){
                int digit=n%10;
                li.add(digit);
                n/=10;
            }
            Collections.reverse(li);
            li1.addAll(li);
        }
       int n[]=new int[li1.size()];
       int i = 0;
       for(int x:li1){
           n[i]=x;
           i++;
       }
       
       return n;
    }
}