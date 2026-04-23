class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();

        for( int i =0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if( store.containsKey(diff)){
            return new int[] { store.get(diff), i};
        }
         store.put(num, i);
        }
       return new int[] {};
    }
}
