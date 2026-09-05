class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek() == '(' && ch == ')'){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        return stack.size();
    }
}