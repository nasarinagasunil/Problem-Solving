class Solution {
    public double myPow(double x, int n) {
        if(x==0)
            return 0.0;
        if(n==0)
            return 1.0;
        double result=1.0;
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        while(N>0){
            if(N%2==1){
                result=result*x;
            }
            x=x*x;
            N=N/2;

        }
        
        return result;
    }
}
