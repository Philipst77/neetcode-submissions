class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        nums_len = 2 * len(nums)
        ans =[] * nums_len

        for num in nums*2:
            ans.append(num)


        return ans