class Solution {
    public boolean validDigit(int n, int x) {
        String n1 = String.valueOf(n);
        String n2 = String.valueOf(x);
        char arr[] = n1.toCharArray();
        int a = arr[0]-'0';
        if(a==x){
            return false;
        }
        else{
            if(n1.contains(n2)){
                return true;
            }
        }
        return false;
    }
}