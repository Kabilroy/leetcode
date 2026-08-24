class Solution {
    public boolean areNumbersAscending(String s) {
       List<Integer> li = new ArrayList<>();
       String[] m = s.split("\\s+");
       for(int i = 0;i<m.length;i++)
       {
          String k1 ="";
          char [] b = m[i].toCharArray();
          
          for(int j = 0;j<b.length;j++)
         {
            if(Character.isDigit(b[j]))
            {
               k1 = k1+b[j];
               
            }
         }
         if(!k1.equals("")){
          int k = Integer.parseInt(k1);
                li.add(k);
         }
       }
       for(int i = 1;i<li.size();i++)
       {
        if(li.get(i-1)>=li.get(i)){
            return false;
        }
       }
       return true;
    }
}