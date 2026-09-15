class Solution:
    def search(self, nums: List[int], target: int) -> int:
        L =0
        R= len(nums)-1
        while L <=R:
            if nums[L] == target:
                return L
            elif nums[R] == target:
                return R
            elif nums[R] > target:
                R-=1
            else:
                L+=1
        return -1
            
            
        