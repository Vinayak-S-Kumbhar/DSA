class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '#' && !stack.isEmpty()){
                stack.pop();
                continue;
            }
            if(ch != '#')stack.push(ch);
        }
        StringBuilder str1 = new StringBuilder();
        while(!stack.isEmpty()){
            str1.append(stack.pop());
        }

        for(char ch: t.toCharArray()){
            if(ch == '#' && !stack.isEmpty()){
                stack.pop();
                continue;
            }
            if(ch != '#')stack.push(ch);
        }
        StringBuilder str2 = new StringBuilder();
        while(!stack.isEmpty()){
            str2.append(stack.pop());
        }

        System.out.println("str1 " + str1 + "   str2 " + str2);
        return str1.toString().equals(str2.toString());
    }
}