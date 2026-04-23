class Solution {
    public int singleNumber(int[] nums) {
        
    int res =0;
    for( int n =0; n < nums.length; n++){
        res ^= nums[n];
        }           
        
         return res;

    }
}