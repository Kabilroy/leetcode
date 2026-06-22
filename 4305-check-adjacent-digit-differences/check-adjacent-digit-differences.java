class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {

            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            int n1 = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
            int diff = Math.abs(n - n1);
            if (diff > 2) {
                return false;
            }
        }
        return true;
    }
}