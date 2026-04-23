class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        map={}

        for i ,n in  enumerate(nums):   # enumerate gives you index and value at index  when looping through list
            diff = target -n  # diffrence is equal to target value - value at index we use n  i is index which n is at 

            if diff  in map:   # if diff value is in our hash map we want to return the index at which that value is stored at 
            # how ever we strutured the hashmap as so  keys (values) -> values(index) so if we need to return index at which diff is at
            # we need to index into the hashmap to get values mapped from keys and in this case things mapped in values is indexs of each num
                return[map[diff], i]
            

            map[n] =i # put number in key position of hashmap and map value of that key to be its corresponding index position in the array we loop

        






        # if you need fast look up put in in the key of the hashmap because dict keys are optimized for lookup
        # if you need to return later put it in dict value