class Solution {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        boolean ans = Solution.hasDuplicate(nums);
        System.out.println(ans); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        boolean ans2 = Solution.hasDuplicate(nums2);
        System.out.println(ans2); // Output: false
    }
}