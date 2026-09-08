class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!sb.isEmpty()){
                if(sb.charAt(sb.length() - 1) == '(' && ch == ')'){
                    sb.deleteCharAt(sb.length() -1);
                    stack.pop();
                    continue;
                }
            }
            if(ch == ')' || ch == '('){
                sb.append(ch);
                stack.push(i);
            }
        }
        StringBuilder anser = new StringBuilder(s);
        while(!stack.isEmpty()){
            anser.deleteCharAt(stack.pop());
        }

        return anser.toString();
    }
}