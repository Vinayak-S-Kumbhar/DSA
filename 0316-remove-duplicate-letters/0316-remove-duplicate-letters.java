class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> used = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(used.contains(ch)){
                continue;
            }

            while(!sb.isEmpty() && ch < sb.charAt(sb.length() - 1) && map.get(sb.charAt(sb.length() - 1)) > i){
                char removed = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                used.remove(removed);
            }
            sb.append(ch);
            used.add(ch);
        }
        return sb.toString();
    }
}