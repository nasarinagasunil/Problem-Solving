class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        
        boolean sign = (dividend > 0) == (divisor > 0);
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;
        
        while (n >= d) {
            int counter = 0;
            while (n >= (d << (counter + 1))) {
                counter++;
            }
            ans += (1L << counter);
            n -= (d << counter);
        }
        
        ans = sign ? ans : -ans;
        
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int) ans;
    }
}

