class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        # stack to hold unresolved value if we see a special character which is an opertor then we pop off the stack and apply to popped 
        # values
        # Invariant  operator consumes two values and produces exactly one 
        stack=[]
        ans =0
        for num in tokens:
            if num != '+' and num != '-' and num != '*' and num != '/':
                stack.append(int(num))
            
            elif num == '+' and len(stack) >=2:
               val1= stack.pop()
               val2 = stack.pop()
               ans = val1 + val2
               stack.append(ans)
            elif num == '-' and len(stack) >=2:
                val1 = stack.pop() #b     b-a and a -b not same we could have neg val
                val2 = stack.pop() #a
                ans = val2 - val1
                stack.append(ans)
            elif num == '*' and len(stack) >=2:
                val1 = stack.pop()
                val2 = stack.pop()
                ans = val1 * val2
                stack.append(ans)
            elif num == '/' and len(stack) >=2:
                val1 = stack.pop()
                val2 = stack.pop()
                ans = int(val2/ val1)
                stack.append(ans)

        return stack[0]