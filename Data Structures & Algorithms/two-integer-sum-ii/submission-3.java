class Solution {
    public int[] twoSum(int[] nums, int target) {
        


        int L =0;
        int R = nums.length -1;


        while( L < R){
            
            int sum = nums[L] + nums[R];

            if(sum == target ){
                return new int[] {L+1, R+1};

            }


            if( sum > target){
                R--;
            } 
            if( sum < target){
                L++;
            }

        }
        return new int[] { L+1, R+1};

    }
}
