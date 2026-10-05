class Solution {
    public int fib(int n) {
        return print(n, 0, 1,1);
    }
    public int print(int n, int frist, int second, int stop){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        if(n == ++stop){
            return frist + second;
        }

        int third = frist + second;
        frist = second;
        second = third;
        return print(n, frist, second, stop);
    }
}