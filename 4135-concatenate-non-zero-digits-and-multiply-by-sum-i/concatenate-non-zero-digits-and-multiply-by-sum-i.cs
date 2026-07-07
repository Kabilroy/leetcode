public class Solution {
    public long SumAndMultiply(int n) {
        String n1 =Convert.ToString(n);
       
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n1.Length;i++){
            if(n1[i]!='0'){
                sb.Append(n1[i]);
            }
        }
        String k =sb.ToString();
        if (sb.Length == 0){
            return 0;
        }

        long x = long.Parse(k);
        long x1=x;
        long sum = 0;
        while(x1>0){
          sum+=x1%10;
          x1/=10;
        }
        return x*sum;
    }
}