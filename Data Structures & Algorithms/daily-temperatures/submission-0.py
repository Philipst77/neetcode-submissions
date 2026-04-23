class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack =[]
        ans = [0] * len(temperatures)

        for i in range(len(temperatures)):
            if not stack:
                stack.append(i)
            while stack and temperatures[stack[-1]] < temperatures[i]:
                prev = stack.pop()
                ans[prev] = i - prev
           
            else:
                stack.append(i)
        return ans


