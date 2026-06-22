class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        boolean arr[] = new boolean[candies.length];
        List<Boolean> li = new ArrayList<>();
        for(int i:candies){
                 max=Math.max(max,i);
        }
        for(int i = 0; i < candies.length;i++)
        {
            if(candies[i]+extraCandies>=max){
                
                 li.add(true);
            }
            else{
                li.add(false);
            }
        }
        System.out.println(Arrays.toString(arr));
        return li;
    }
}