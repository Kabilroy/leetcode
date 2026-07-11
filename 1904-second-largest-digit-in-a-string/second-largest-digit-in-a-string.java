class Solution {
    public int secondHighest(String s) {
        char[] a=s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<a.length;i++){
            if(Character.isDigit(a[i])){
                sb.append(a[i]-'0');
            }
        }

        String k =sb.toString();
        char [] p = k.toCharArray();
        Arrays.sort(p);
        int arr[] = new int[p.length];
        
        for(int i = 0;i<arr.length;i++){
            arr[i]=p[i]-'0';
        }

        if(arr.length==0){
            return -1;
        }

       int max = Integer.MIN_VALUE;
       int sec = Integer.MIN_VALUE;
      
       for(int i = 0;i<arr.length;i++){
         int a1=arr[i];

        if(a1>max){
            sec = max;
            max = a1;
        }

        else if(a1>sec && a1!=max){
            sec = a1;
        }
       }

       if(sec==Integer.MIN_VALUE){
        return -1;
       }
   
        return sec;
    }
}