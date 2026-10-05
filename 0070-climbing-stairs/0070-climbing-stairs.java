class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;

        return climbStairsFun(n, 1, 2);
    }

    public int climbStairsFun(int n, int frist , int second) {
        if(n <= 2) return second;

        int therd = frist + second;
        return climbStairsFun(n - 1, second, therd);
    }
}