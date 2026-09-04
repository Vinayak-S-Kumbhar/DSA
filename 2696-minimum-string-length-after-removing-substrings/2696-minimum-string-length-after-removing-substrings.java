class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch == 'B' && sb.length() != 0){
                if(sb.charAt(sb.length() - 1) == 'A'){
                    sb.deleteCharAt(sb.length() - 1);
                    continue;
                }
            }
            if(ch == 'D' && sb.length() != 0){
                if(sb.charAt(sb.length() - 1) == 'C'){
                    sb.deleteCharAt(sb.length() - 1);
                    continue;
                }
            }
            sb.append(ch);
        }

        return sb.length();
    }
}