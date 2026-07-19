class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> li = new ArrayList<>();
        for(int i = left; i<=right; i++){
            int temp = i;
            boolean a=true;
            while(temp>0){
                int digit = temp%10;
                if(digit==0){
                    a=false;
                    break;
                }
                if(i%digit != 0)
                {
                    a=false;
                   break;
                }
                
                temp/=10;
            }
            if(a){
                  li.add(i);
            }
        }
        return li;
    }
}