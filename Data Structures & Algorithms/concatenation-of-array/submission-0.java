class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int  [] ans = new int [ 2 * nums.length];
        for( int i = 0 ; i < n*2 ; i++){
            ans[i] = nums[i%n];
        }
            return ans ;
    }
}