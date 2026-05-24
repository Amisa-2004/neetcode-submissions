class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] nums_concat = new int[2*n]; 
        for(int i = 0; i < n; i++) {
            nums_concat[i] = nums[i];
            nums_concat[i + n] = nums[i];
        }
        return nums_concat;
    }
}