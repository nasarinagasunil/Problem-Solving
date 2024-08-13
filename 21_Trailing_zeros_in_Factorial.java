class Solution{
    static int trailingZeroes(int N){
        // Write your code here
        int result=0;
        for(int i=5;i<=N;i*=5){
            result=result+N/i;
        }
        return result;
    }
}
