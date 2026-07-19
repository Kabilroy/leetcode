class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n =nums.length;
        boolean vi[] = new boolean[n+1];
        for(int n1:nums){
            vi[n1] = true;
        }
        for(int i =1;i<=nums.length;i++){
            if(!vi[i]){
                li.add(i);
            }
        }
        return li;
    }
}