class Solution {
    public String smallestSubsequence(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> used = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(used.contains(ch)) continue;

            while(!sb.isEmpty() && map.get(sb.charAt(sb.length() - 1)) > i && ch < sb.charAt(sb.length() - 1)){
                char c = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                used.remove(c);
            }
            sb.append(ch);
            used.add(ch);
        }

        return sb.toString();
    }
}
