class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            String ch = tokens[i];
            boolean isDigit = ch.length() == 1 ? Character.isDigit(ch.charAt(0)) : Character.isDigit(ch.charAt(1));
            if(isDigit){
                stack.push(Integer.parseInt(ch));
            }else{
                int num1 = stack.pop();
                int num2 = stack.pop();

                if(ch.equals("+")){
                    stack.push(num1 + num2);
                }
                if(ch.equals("-")){
                    stack.push(num2 - num1);
                }
                if(ch.equals("*")){
                    stack.push(num1 * num2);
                }
                if(ch.equals("/")){
                    stack.push(num2 / num1);
                }
            }
        }
        return stack.pop();
    }
}