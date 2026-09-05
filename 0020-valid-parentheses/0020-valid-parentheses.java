class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty()){
                if((stack.peek() == '(' && ch == ')') || 
                (stack.peek() == '{' && ch == '}') ||
                (stack.peek() == '[' && ch == ']')){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        return stack.isEmpty();
    }
}