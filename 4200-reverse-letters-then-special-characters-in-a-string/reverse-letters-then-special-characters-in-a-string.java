class Solution {
    public String reverseByType(String s) {
        char arr[] = s.toCharArray();
        int i =0;
        int j =s.length()-1;
        while(i<j){
            if(Character.isLetter(arr[i])){
                i++;
            }
            else if(Character.isLetter(arr[j])){
                j--;
            }
            else{
                
                   char temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] =temp;
                   i++;
                   j--;
                }
            }
        
        
        i = 0;
        j = s.length()-1;
        while(i<j)
        {
            if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
        return (new String(arr));
    }
}