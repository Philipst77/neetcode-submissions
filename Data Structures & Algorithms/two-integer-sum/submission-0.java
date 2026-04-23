class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> ans = new HashMap<>();

        for(int n=0; n<nums.length; n++){
            int num = nums[n];
            int diff = target - num;
          if(ans.containsKey(diff)){
            return new int[] {ans.get(diff), n};
        }
     ans.put(num ,n);
        }
   return new int[] {};    
   }
}
