public class Solution {
    public string DefangIPaddr(string address) {
        String m="";
        for(int i=0;i<address.Length;i++){
            if(address[i]=='.'){
                m+="[.]";
            }
            else{
                m+=address[i];
            }
        }
        return m;
    }
}