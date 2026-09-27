class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = 0;

        int i=0;
        while(i < sb.length()){
            if(sb.charAt(i) == '('){
                left = i;
            }else if(sb.charAt(i) == ')'){
                right = i;

                String st = sb.substring(left + 1, right);
                String reversedString = new StringBuilder(st).reverse().toString();
                sb.replace(left + 1, right, reversedString);

                sb.deleteCharAt(left);
                sb.deleteCharAt(right -1);

                left = 0; 
                right = 0;
                i = -1;
            }else{

            }
            i++;
        }

        return sb.toString();
    }
}