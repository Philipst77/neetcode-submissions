class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # do prefix and suffix pass and then multiplfy them togther so its a prefix sum alg in a sense 
        #“The first pass builds left products, the second pass multiplies right products, and together they exclude the current index.”
        res =[1] * len(nums)
        # product of all elements to the LEFT of index i
        prefix=1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]

        postfix =1
        # product of all elements to the right of index i

        for i in range(len(nums)-1 ,-1, -1):
            res[i] *= postfix
            postfix *= nums[i]

        return res
#         For each index i, we want:

# product of everything BEFORE i × product of everything AFTER i

# So we split the work into two passes:

# Left → right (prefix products)

# Right → left (postfix products)

# Each pass builds part of the answer.