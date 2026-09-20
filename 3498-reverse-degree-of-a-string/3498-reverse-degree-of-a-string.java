class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int num = 'z' - ch + 1;
            result += num * (i+1);
        }

        return result;
    }
}