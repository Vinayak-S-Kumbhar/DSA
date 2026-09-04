class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(sb.length() != 0){
                if(Character.isUpperCase(ch)){
                    if(Character.toLowerCase(ch) == sb.charAt(sb.length() - 1)){
                        sb.deleteCharAt(sb.length() - 1);
                        continue;
                    }
                }else{
                    if(Character.toLowerCase(sb.charAt(sb.length() - 1)) == ch && Character.isUpperCase(sb.charAt(sb.length() - 1))){
                        sb.deleteCharAt(sb.length() - 1);
                        continue;
                    }
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}