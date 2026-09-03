class Solution {
    public String decodeString(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                stack.push(ch);
            } else {
                StringBuilder chars = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '[') {
                    chars.insert(0, stack.pop());
                }
                stack.pop();

                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num.insert(0, stack.pop());
                }

                StringBuilder repeat = new StringBuilder();
                for (int i = 0; i < Integer.parseInt(num.toString()); i++) {
                    repeat.append(chars);
                }

                for (char c : repeat.toString().toCharArray()) {
                    stack.push(c);
                }
            }

        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();

    }
}