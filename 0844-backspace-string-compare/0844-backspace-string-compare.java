class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '#' && !stack1.isEmpty()){
                stack1.pop();
                continue;
            }
            if(ch != '#')stack1.push(ch);
        }

        Stack<Character> stack2 = new Stack<>();
        for(char ch: t.toCharArray()){
            if(ch == '#' && !stack2.isEmpty()){
                stack2.pop();
                continue;
            }
            if(ch != '#')stack2.push(ch);
        }

        return stack1.equals(stack2);
    }
}