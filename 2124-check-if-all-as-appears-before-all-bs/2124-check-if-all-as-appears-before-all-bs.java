class Solution {
    public boolean checkString(String s) {
        int n = 0;
        for(int i=0; i<s.length() - 1; i++){
            if(s.charAt(i) == 'b' && s.charAt(i + 1) == 'a'){
                return false;
            }
        }

        // if(n >= 1 && s.charAt(s.length() - 1) == 'a'){
        //     n++;
        // }
        
        return true;
    }
}