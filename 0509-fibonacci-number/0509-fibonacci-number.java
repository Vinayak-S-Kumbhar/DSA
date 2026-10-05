class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return print(n, 0, 1);
    }
    public int print(int n, int frist, int second){
        if(n == 1){
            return second;
        }

        int third = frist + second;
        return print(n - 1, second, third);
    }
}