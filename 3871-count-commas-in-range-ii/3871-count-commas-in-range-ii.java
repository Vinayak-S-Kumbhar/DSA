class Solution {
    public long countCommas(long n) {
        if (n < 1000)
            return 0;

        long anser = 0;

        if (n < 1000000.0) {
            anser = n - 1000 + 1;
        } else if (n < 1000000000.0) {
            anser += n - 1000 + 1;
            anser += n - 1000000.0 + 1;
        } else if (n < 1000000000000.0) {
            anser += n - 1000 + 1;
            anser += n - 1000000.0 + 1;
            anser += n - 1000000000.0 + 1;
        } else if (n < 1000000000000000.0) {
            anser += n - 1000 + 1;
            anser += n - 1000000.0 + 1;
            anser += n - 1000000000.0 + 1;
            anser += n - 1000000000000.0 + 1;
        }else{
            anser += n - 1000 + 1;
            anser += n - 1000000.0 + 1;
            anser += n - 1000000000.0 + 1;
            anser += n - 1000000000000.0 + 1;
            anser += n - 1000000000000000.0 + 1;
        }

        return anser;
    }
}