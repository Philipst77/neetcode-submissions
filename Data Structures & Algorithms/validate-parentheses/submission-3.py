class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {')': '(', '}': '{', ']': '['}

        for char in s:
            if char in pairs.values():      # only allows opening brackets to be appended to the stack by saying if current value in string is not
            # one that is specified in dict values dont add it to stack
                stack.append(char)
            else:                           # closing
                if not stack:  # other wise if there is no items in stack because none were added because none were apart of dict.values
                    return False # stack is empty return false
                if stack[-1] != pairs[char]: # if stack top is not equal to corresponding key pair from dict return false 
                    return False
                stack.pop() # other wise if so pop that valid parenthesie off and go onto the next paranthesis 

        return len(stack) == 0
