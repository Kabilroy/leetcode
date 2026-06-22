class Solution {
    public int maxNumberOfBalloons(String text) {
        int a = 0;
        int b = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b': {
                    b++;
                    break;
                }
                case 'l':{
                    l++;
                    break;
                }
                case'o':{
                    o++;
                    break;
                }
                case'n':{
                    n++;
                    break;
                }
                case'a':{
                    a++;
                    break;
                }
            }
        }
        return Math.min(b,Math.min(a,Math.min(n,Math.min(l/2,o/2))));
    }
}