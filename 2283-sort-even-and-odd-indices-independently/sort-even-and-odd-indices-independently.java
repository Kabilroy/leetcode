class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 != 0) {
                li.add(nums[i]);      // Odd indices
            } else {
                li1.add(nums[i]);     // Even indices
            }
        }

        Collections.sort(li, Collections.reverseOrder()); // Odd -> Descending
        Collections.sort(li1);                            // Even -> Ascending

        int arr[] = new int[nums.length];

        int k = 0;
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                arr[i] = li1.get(k);   // Even list
                k++;
            } else {
                arr[i] = li.get(j);    // Odd list
                j++;
            }
        }

        return arr;
    }
}