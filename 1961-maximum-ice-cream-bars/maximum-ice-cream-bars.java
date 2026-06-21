class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int to = 0;
        int co = 0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(to+costs[i] <= coins){
                to+=costs[i];
                co++;
            }
            // else{
            //     break;
            // }
        }
        return co;
    }
}