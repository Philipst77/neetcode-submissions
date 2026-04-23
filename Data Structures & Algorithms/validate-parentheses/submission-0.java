class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hashmap = new HashMap<>(3);

        hashmap.put(')','(');
        hashmap.put('}','{');
        hashmap.put(']','[');

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(hashmap.containsKey(c)){
                if(!stack.isEmpty() && hashmap.get(c).equals(stack.peek())){
                    stack.pop();
                }
                else{
                    return false;
                }
        
                }else{
                    stack.push(c);

            }
        }
    return stack.isEmpty();
    }
}
