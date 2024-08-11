class Solution {
    public static int findXOR(int l, int r) {
        return (function(l-1) ^ function(r));
    }
    private static int function(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        else return n;
    }
}
