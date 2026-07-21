class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            boolean a = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                  for(int k = j+1;k<nums2.length;k++){
                    if(nums2[k]>nums2[j]){
                        li.add(nums2[k]);
                        a = true;
                        break;
                    }
                  }
                  if(!a){
                    li.add(-1);
                  }
                  break;
                }
            }

        }
        int arr[] = new int[li.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}