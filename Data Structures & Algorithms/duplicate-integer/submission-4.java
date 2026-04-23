class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> freq = new HashSet<>();

        for(int i : nums){
            if( freq.contains(i)){
                return true;
            } else {
                freq.add(i);
            }
        }
        return false;
    }
}
