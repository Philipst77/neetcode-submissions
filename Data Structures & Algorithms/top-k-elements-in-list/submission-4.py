class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map ={}
        ans=[] * k
        for num in nums:
            map[num] = map.get(num,0) +1
            

        sorted_values = sorted(map.keys(), key=lambda x: map[x] ,reverse=True)
        
        # map.keys() in this case are the numbers in the array nums
        # values in map.values() are the frequency( number of times those numbers occur in nums array)
        #key( numbers) -> values(frequencey of numbers)
        # we sorted keys by there values in descending order adn then return that 

        return sorted_values[:k]