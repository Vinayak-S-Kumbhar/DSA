class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }

        StringBuilder anser = new StringBuilder();
        while(!stack.isEmpty()){
            anser.insert(0,stack.pop());
        }
        return anser.toString();
    }
}